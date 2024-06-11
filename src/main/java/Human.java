public class Human {

    private String name;
    private String selection;

    private int score;

    public Human(String name,String selection, int score){
        this.selection = selection;
        this.name = name;
        this.score = score;
    }
    public String getName(){
        return name;
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
