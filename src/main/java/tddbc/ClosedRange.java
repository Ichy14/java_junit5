package tddbc;

public class ClosedRange {
    Integer lowerPoint;
    Integer upperPoint;

    public ClosedRange(Integer input1, Integer input2){
        if (input1 <= input2) {
            lowerPoint = input1;
            upperPoint = input2;
        } else {
            lowerPoint = input2;
            upperPoint = input1;
        }
    }

    public Integer getLowerPoint() {
        return lowerPoint;
    }

    public Integer getUpperPoint() {
        return upperPoint;
    }

//    "[" + input1.toString() +
    //hoge(closedRande) -> "[1,2]"

    public String makeFormatedString(Integer lowerPoint, Integer upperPoint){

        return "[" + lowerPoint.toString() + "," + upperPoint.toString() + "]";
    }
}

