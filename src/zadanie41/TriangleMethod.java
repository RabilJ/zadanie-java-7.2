package zadanie41;

public class TriangleMethod {

    protected boolean isRightTriangle(Triangle triangle){
        if(triangle.getA()>triangle.getB()&&triangle.getA()>triangle.getC()){
            if(triangle.getA()*triangle.getA()==(triangle.getB()*triangle.getB())+(triangle.getC()*triangle.getC())){
                return true;
            }else{
                return false;
            }
        }else if(triangle.getB()>triangle.getA()&&triangle.getB()>triangle.getC()){
            if(triangle.getB()*triangle.getB()==(triangle.getA()*triangle.getA())+(triangle.getC()*triangle.getC())){
                return true;
            }else{
                return false;
            }
        }else if(triangle.getC()>triangle.getB()&&triangle.getC()>triangle.getA()){
            if(triangle.getC()*triangle.getC()==(triangle.getA()*triangle.getA())+(triangle.getB()*triangle.getB())){
                return true;
            }else{
                return false;
            }
        }
        return true;
    }
}
