public class MovablePoint extends Point{
    float xSpeed=0.0f;
    float ySpeed=0.0f;
    MovablePoint(){};
    MovablePoint(float x,float y,float xSpeed,float ySpeed ){
        super(x,y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    MovablePoint(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getXspeedYspeed(){
        return new float[]{this.xSpeed,this.ySpeed};
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x="+super.getX()+
                "y="+super.getY()+
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
    public MovablePoint move(){
        super.setXY(super.getX()+xSpeed,super.getY()+ySpeed);
        return this;

    }
}
