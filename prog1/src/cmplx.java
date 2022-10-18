public class cmplx {
    int real,img;

    public cmplx(int real, int img) {
        this.real = real;
        this.img = img;
    }

    public cmplx() {
//        System.out.println("default");
    }

    public cmplx add(cmplx n1,cmplx n2)
    {
        cmplx sum= new cmplx();
        sum.real=n1.real+n2.real;
        sum.img=n1.img+n2.img;
        return sum;
    }
    public cmplx add(cmplx n1,cmplx n2, cmplx n3)
    {
        cmplx sum= new cmplx();
        sum.real=n1.real+n2.real+n3.real;
        sum.img=n1.img+n2.img+n3.img;
        return sum;
    }
    public cmplx sub(cmplx n1,cmplx n2)
    {
        cmplx diff= new cmplx();
        diff.real=n1.real-n2.real;
        diff.img=n1.img-n2.img;
        return diff;
    }
    public void display()
    {
        System.out.println(real+" + i("+img+")");
    }
}
