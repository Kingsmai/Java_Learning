package tut.demo.procgenmap;

public class ValueNoise {
	private final int smallestOctave;
    private final int largestOctave;
    private final int baseSeed;
    private final java.util.Random random;
    
    public ValueNoise() {
        this((int) (Math.random() * Integer.MAX_VALUE));
    }
    
    public ValueNoise(int seed) {
        this(1, 16, seed);
    }
    
    public ValueNoise(int smallestOctave, int largestOctave, int seed) {
        if (!isPowerOfTwo(smallestOctave) || !isPowerOfTwo(largestOctave)) {
            throw new IllegalArgumentException("smallestOctave: " + smallestOctave + ", largestOctave: " + largestOctave + " need to be powers of two");
        }
        
        this.smallestOctave = smallestOctave;
        this.largestOctave = largestOctave;
        this.baseSeed = seed;
        this.random = new java.util.Random();
    }
    
    public double getNoiseValueAt(int row, int col) {
        int stepSize = largestOctave;
        int maxAmplitude = largestOctave;
        double value = 0;
        int biggestPossibleValue = 0;
        
        while (stepSize >= smallestOctave) {
            value += getInterpolatedValueAt(row, col, stepSize, maxAmplitude);
            biggestPossibleValue += maxAmplitude;
            
            stepSize /= 2;
            maxAmplitude /= 2;
        }
        
        return value / biggestPossibleValue;
    }
    
    private double getInterpolatedValueAt(int row, int col, int stepSize, int maxAmplitude) {
        java.awt.Rectangle interpolationSquare = new java.awt.Rectangle();
        
        interpolationSquare.x = (col / stepSize) * stepSize;
        interpolationSquare.y = (row / stepSize) * stepSize;
        interpolationSquare.width = stepSize;
        interpolationSquare.height = stepSize;
        
        return interpolateValueInSquare(interpolationSquare, row, col, maxAmplitude);
    }
    
    private double interpolateValueInSquare(java.awt.Rectangle interpolationSquare, int row, int col, int maxAmplitude) {
        int x = interpolationSquare.x;
        int y = interpolationSquare.y;
        int width = interpolationSquare.width;
        int height = interpolationSquare.height;
        
        double nwRandomValue = generateRandomValueAt(y, x, maxAmplitude);
        double neRandomValue = generateRandomValueAt(y, x + width, maxAmplitude);
        double swRandomValue = generateRandomValueAt(y + height, x, maxAmplitude);
        double seRandomValue = generateRandomValueAt(y + height, x + width, maxAmplitude);
        
        double westInterpolatedValue = weightedAverage(nwRandomValue, swRandomValue, (double) (row - y) / height);
        double eastInterpolatedValue = weightedAverage(neRandomValue, seRandomValue, (double) (row - y) / height);
        
        return weightedAverage(westInterpolatedValue, eastInterpolatedValue, (double) (col - x) / width);
    }
    
    private int generateRandomValueAt(int row, int col, int maxAmplitude) {
        random.setSeed(((long) baseSeed) << 32 | row << 16 | col);
        
        return random.nextInt(maxAmplitude + 1);
    }
    
    private static double weightedAverage(double a, double b, double percentage) {
        return (1 - percentage) * a + percentage * b;
    }
    
    private static boolean isPowerOfTwo(int n) {
        if (n < 1) {
            return false;
        } else if (n == 1) {
            return true;
        } else if (n / 2 != n / 2.0) {
            return false;
        } else {
            return isPowerOfTwo(n / 2);
        }
    }
    
    public int getBaseSeed() {
        return baseSeed;
    }
}
