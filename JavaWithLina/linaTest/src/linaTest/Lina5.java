package linaTest;

public class Lina5 {
    public static void main(String[] args) {
        double[] nums = new double[]{11.5,8.2, 13, 14.9,10,16.5};
        double result = calculateAverage(nums);
        System.out.println(result);

    }

    private static double calculateAverage(double[]nums){
        Double sum = Double.valueOf(0);
        if(nums.length !=0){
            for (Double num : nums){
                sum+= num;
            }
            return sum.doubleValue()/nums.length;
        }
        return sum;
    }
}
