//Vectorクラスを継承し，2次元ベクトルを表すクラス
public class Vector2D extends Vector{
    //コンストラクタ
    //スーパークラスのコンストラクタによりdimensionを2で初期化する
    //public Vector2D();

    
    //コンストラクタ，スーパークラスのコンストラクタにより
    //dimensionを2で初期化し，続けて
    //フィールドelementsの0番目の要素をxで
    //フィールドelementsの1番目の要素をyで初期化する
    //public Vector2D(double x, double y);
    

    //abstract double innerProduct(Vector v)を実装
    //thisの0番目の要素とvの0番目の要素の積と
    //thisの1番目の要素とvの1番目の要素の積
    //の和によりthisとvの内積を求めるメソッド
    //public double innerProduct(Vector v);
    

    //abstract double scalarMultiplication(double scalar)
    //を実装 
    //thisの各要素にscalarを掛けた値を要素とする
    //vector，scalar * thisを返すメソッド
    //Vector scalarMultiplication(double scalar);
    Vector scalarMultiplication(double scalar){
	Vector r  = new Vector2D();
	//以下を実装し，rを返す．
	return r;//
    }

    
    //abstract double addVector(Vector v)を実装
    //thisと引数vの加算により得られるvectorを返すメソッド
    //Vector addVector(Vector v);
    Vector addVector(Vector v){
	Vector r = new Vector2D();
	//以下を実装し，rを返す．
	return r;
    }
}
