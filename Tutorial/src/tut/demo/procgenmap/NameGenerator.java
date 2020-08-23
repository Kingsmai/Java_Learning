package tut.demo.procgenmap;

public class NameGenerator {
	private final java.util.ArrayList<String> syllables;
    private final java.util.ArrayList<String> prefixes;
    private final java.util.ArrayList<String> suffixes;   
    private final java.util.Random random;
    
    public NameGenerator() {
        this((int) (Math.random() * Integer.MAX_VALUE));
    }
    
    public NameGenerator(int seed) {
        this.syllables = new java.util.ArrayList<String>();
        this.prefixes = new java.util.ArrayList<String>();
        this.suffixes = new java.util.ArrayList<String>();
        this.random = new java.util.Random(seed);
        
        initSyllables();
        initPrefixes();
        initSuffixes();
    }
    
    private void initSyllables() {
        String syllableString =  "er,al,mel,van,sylv,row,per,rea,fil,nog,uck,rin,el,den,mist,fog,myst,mes,vin,gia,gar,bar,boa,sam,san,so,ea,borg,goj,is,ta,tand,tor,cai,riel,faf,nar,gen,log,si,cor,nae,lea,rek,nyar,goth,yogg,crel,pi,man,in,cu,na,bu,lum,nek,ka,i,drin,sar,vall,kex,ves,saa,tru,lane,var,loosh,go,lem";
        
        addStringParts(syllables, syllableString, ",");
    }
    
    private void initPrefixes() {
        String prefixString =  "aber ,new ,old ,el ,riven,long,lost ,sand,river,sea,leaf,forgotten ,san ,bard,far";
        
        addStringParts(prefixes, prefixString, ",");
    }
    
    private void initSuffixes() {
        String suffixString = "fort, harbor,row,port,land,rock,dale,wind,lake,pond,haven,hope,ville, song,earth";
        
        addStringParts(suffixes, suffixString, ",");
    }
    
    public String generateName() {
        String name = "";
        boolean usesPrefix = random.nextInt(100) < 25;
        boolean usesSuffix = random.nextInt(100) < 25;
        int minSyllables = (usesPrefix || usesSuffix) ? 1 : 2;
        int maxSyllables = (usesPrefix && usesSuffix) ? 2 : 3;
        int syllableCount = random.nextInt(maxSyllables - minSyllables + 1) + minSyllables;
        
        if (usesPrefix) {
            name += prefixes.get(random.nextInt(prefixes.size()));
        }
        
        for (int i = 0; i < syllableCount; i++) {
            name += syllables.get(random.nextInt(syllables.size()));
        }
        
        if (usesSuffix) {
            name += suffixes.get(random.nextInt(suffixes.size()));
        }
        
        return capitalizeEachWord(name);
    }
    
    private static String capitalizeEachWord(String str) {
        String result = "";
        String[] parts = str.split(" ");
        
        for (String s : parts) {
            result += s.substring(0, 1).toUpperCase() + s.substring(1) + " ";
        }
        
        return result.trim();
    }
    
    private static void addStringParts(java.util.ArrayList<String> list, String str, String separator) {
        String[] parts = str.split(separator);
        
        for (String p : parts) {
            list.add(p);
        }
    }
}
