package ArrayList;

public class MyGenericClass <T extends Number,T2>{
    T x;
    T2 y;;
    MyGenericClass(T x,T2 y){
        this.x=x;
        this.y=y;
    }
    public T2 getValue(){
        return y;
    }


}
