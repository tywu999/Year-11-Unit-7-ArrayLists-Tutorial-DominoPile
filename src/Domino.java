public class Domino {
    private int top = 0;
    private int bottom = 0;

    public Domino (int top, int bottom){
        this.top = top;
        this.bottom = bottom;
    }
    public int getTop(){
        return top;
    }
    public int getBottom(){
        return bottom;
    }
    public void setTop(int top){
        this.top = top;
    }
    public void setBottom(int bottom){
        this.bottom = bottom;
    }
    public String toString(){
        return top + "/" + bottom;
    }
    public void flip(){
        int z = top;
        this.top = bottom;
        this.bottom = z;
    }
    public void settle(){
        if(top > bottom){
            flip();
        }
    }
    public int compareTo(Domino other){
        other.settle();
        settle();
        if(other.top >= top){
            return -1;
        } else if (other.top < top) {
            return 1;
        }
        else{
            return 0;
        }
    }
    public int compareToWeight(Domino other){
        int otherone = other.top + other.bottom;
        int thisone = top + bottom;
        if(otherone > thisone){
            return -1;
        }
        if(thisone > otherone){
            return 1;
        }
        return 0;
    }
    public boolean canConnect(Domino other){
        if(other.top == top || other.top == bottom){
            return true;
        }
        if(other.bottom == bottom || other.bottom == top){
            return true;
        }
        return false;
    }

}
