public class Computer {
    private int score;
    private String selection;
    public Computer(String selection,int score){
        this.score = score;
        this.selection = selection;
    }
    public int getScore(){
        return score;
    }
    public String getSelection(){
        return selection;
    }
    public void setScore(){
        this.score++;
    }
    public void setSelection(String selection){
        this.selection=selection;
    }
}
