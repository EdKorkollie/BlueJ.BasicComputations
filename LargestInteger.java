 


public class LargestInteger {

    public Integer findLargestNumberUsingConditional(Integer[] integers){
        return(integers[0] > integers[1]) ? 
        ((integers[0] > integers[2]) ? integers[0] : integers[2]): 
        ((integers[2] > integers[1]) ? integers[2]: integers[1]); 
        
    }

    public Integer findLargestNumberUsingMathMax(Integer[] integers){
        return Math.max(Math.max(integers[0],integers[1]),integers[2]);
    }
}
