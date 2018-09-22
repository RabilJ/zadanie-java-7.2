package zadanie41;

public class TriangleMethod {

    protected boolean isRightTriangle(Triangle triangle){
        if(triangle.getA()>triangle.getB()&&triangle.getA()>triangle.getC()){
            return triangle.getA()*triangle.getA()==(triangle.getB()*triangle.getB())+(triangle.getC()*triangle.getC());
        }else if(triangle.getB()>triangle.getA()&&triangle.getB()>triangle.getC()){
            return triangle.getB()*triangle.getB()==(triangle.getA()*triangle.getA())+(triangle.getC()*triangle.getC());
        }else if(triangle.getC()>triangle.getB()&&triangle.getC()>triangle.getA()){
            return triangle.getC()*triangle.getC()==(triangle.getA()*triangle.getA())+(triangle.getB()*triangle.getB());
        }
        return true;
    }
}
