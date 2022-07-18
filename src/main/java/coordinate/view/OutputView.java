package coordinate.view;


public class OutputView {
    private static final int MAX_INT = 24;
    public void outputCoord(){
        StringBuffer s = new StringBuffer();
        for(int i=MAX_INT;i>0;i--){
            if(i%2==0){
                if(i<10){
                    s.append(" ");
                }
                s.append(i);
            }
            if(i%2==1){
                s.append("  ");
            }
            s.append("|\n");
        }
        s.append("  +");
        for(int i=0;i<MAX_INT*2+7;i++){
            s.append("-");
        }
        s.append("\n ");
        for(int j=0;j<=MAX_INT;j+=2){
            s.append(j+"   ");
        }
        System.out.println(s);
    }
}
