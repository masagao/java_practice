//Vectorクラスを継承し，2次元ベクトルを表すクラス
public class Vector2D extends Vector{
    //コンストラクタ
    //スーパークラスのコンストラクタによりdimensionを2で初期化する
    public Vector2D() {
        super();
    }

    //コンストラクタ，スーパークラスのコンストラクタにより
    //dimensionを2で初期化し，続けて
    //フィールドelementsの0番目の要素をxで
    //フィールドelementsの1番目の要素をyで初期化する
    public Vector2D(double x, double y) {
        super(2);
        setElement(0, x);
        setElement(1, y);
    }

    //abstract double scalarMultiplication(double scalar)
    //を実装
    //thisの各要素にscalarを掛けた値を要素とする
    //vector，scalar * thisを返すメソッド
    //Vector scalarMultiplication(double scalar);
    Vector scalarMultiplication(double scalar){
        Vector r  = new Vector2D();

        int dimensionCount = r.getDimension();
        r.setDimension(dimensionCount);

        for(int i = 0; i < dimensionCount; i++) {
            r.setElement(i, scalar*this.getElement(i));
        }
        
        return r;
    }


    //abstract double innerProduct(Vector v)を実装
    //thisの0番目の要素とvの0番目の要素の積と
    //thisの1番目の要素とvの1番目の要素の積
    //の和によりthisとvの内積を求めるメソッド
    public double innerProduct(Vector v) {
        int dimensionCount = this.getDimension();
        double innerProduct = 0;

        for(int i = 0; i < dimensionCount; i++) {
            innerProduct += this.getElement(i)*v.getElement(i);
        }

        return innerProduct;
    }


    //abstract double addVector(Vector v)を実装
    //thisと引数vの加算により得られるvectorを返すメソッド
    //Vector addVector(Vector v);
    Vector addVector(Vector v){
        Vector r = new Vector2D();

        int dimensionCount = r.getDimension();
        r.setDimension(dimensionCount);

        for(int i = 0; i < dimensionCount; i++) {
            r.setElement(i, this.getElement(i)+v.getElement(i));
        }

        return r;
    }
}
