package demo.procgenmap;

public class WorldMap {
	// If you have a device with a smaller screen, lower the value of this variable so that the map is fully visible in your console:
    private static final int CONSOLE_WIDTH = 40;
    
    private static final int MAP_ROWS = CONSOLE_WIDTH * 2;
    private static final int MAP_COLS = CONSOLE_WIDTH;
    
    private char[][] biomes;
    private ValueNoise valueNoise;    
    private java.util.TreeMap<Character, Integer> biomeCounts;
    private java.util.HashMap<Character, String> biomeNames;
    private NameGenerator nameGenerator;
    
    public WorldMap() {
        this.biomes = new char[MAP_ROWS][MAP_COLS];
        this.valueNoise = new ValueNoise();        
        this.biomeCounts = new java.util.TreeMap<Character, Integer>();
        this.biomeNames = new java.util.HashMap<Character, String>();
        this.nameGenerator = new NameGenerator(valueNoise.getBaseSeed());
        
        initBiomeNames();
        generate();
    }
    
    private void initBiomeNames() {
        biomeNames.put(' ', "ocean");
        biomeNames.put('.', "beach");
        biomeNames.put('"', "plains");
        biomeNames.put('^', "hills");
        biomeNames.put('#', "forest");
        biomeNames.put('A', "mountain");
    }
    
    private void generate() {
        for (int r = 0; r < MAP_ROWS; r++) {
            for (int c = 0; c < MAP_COLS; c++) {
                biomes[r][c] = getBiomeAt(r, c);
                
                incrementBiomeCount(biomes[r][c]);
            }
        }
    }
    
    private char getBiomeAt(int row, int col) {
        char ocean = ' ';
        char beach = '.';
        char plains = '"';
        char hills = '^';
        char forest = '#';
        char mountain = 'A';
        
        double noiseValue = valueNoise.getNoiseValueAt(row, col);
        
        if (noiseValue < 0.35) {
            return ocean;
        } else if (noiseValue < 0.4) {
            return beach;
        } else if (noiseValue < 0.5) {
            return plains;
        } else if (noiseValue < 0.52) {
            return hills;
        } else if (noiseValue < 0.6) {
            return plains;
        } else if (noiseValue < 0.7) {
            return forest;
        } else {
            return mountain;
        }
    }
    
    private void incrementBiomeCount(char biome) {
        if (!biomeCounts.containsKey(biome)) {
            biomeCounts.put(biome, 1);
        } else {
            biomeCounts.put(biome, biomeCounts.get(biome) + 1);
        }
    }
    
    public void print() {
        for (int r = 0; r < MAP_ROWS; r++) {
            for (int c = 0; c < MAP_COLS; c++) {
                System.out.print(biomes[r][c]);
            }
            
            System.out.println();
        }
    }
    
    public void printWithInfo() {
        System.out.println("This is the world of " + nameGenerator.generateName() + ".");
        System.out.println("World seed: " + valueNoise.getBaseSeed());
        
        printBiomeCounts();
        System.out.println();
        print();
    }
    
    private void printBiomeCounts() {
        for (char biome : biomeCounts.keySet()) {
            int biomeCount = biomeCounts.get(biome);
            double percent = ((double) biomeCount / (MAP_ROWS * MAP_COLS)) * 100;
            
            System.out.printf(biome + " %.2f%% of the world is " + biomeNames.get(biome) + "\n", percent);
        }
    }
}
