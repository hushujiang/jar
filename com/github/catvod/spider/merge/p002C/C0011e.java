package com.github.catvod.spider.merge.p002C;

/* renamed from: com.github.catvod.spider.merge.C.e */
/* loaded from: classes.dex */
public final class C0011e {

    /* renamed from: d */
    private static final C0011e[] f67d = m1490a();

    /* renamed from: a */
    private final int f68a;

    /* renamed from: b */
    private final C0010d[] f69b;

    /* renamed from: c */
    private final int f70c;

    private C0011e(int i, C0010d... c0010dArr) {
        C0009c[] m1494a;
        this.f68a = i;
        this.f69b = c0010dArr;
        int m1493b = c0010dArr[0].m1493b();
        int i2 = 0;
        for (C0009c c0009c : c0010dArr[0].m1494a()) {
            i2 += (c0009c.m1495b() + m1493b) * c0009c.m1496a();
        }
        this.f70c = i2;
    }

    /* renamed from: a */
    private static C0011e[] m1490a() {
        return new C0011e[]{new C0011e(1, new C0010d(7, new C0009c(1, 19)), new C0010d(10, new C0009c(1, 16)), new C0010d(13, new C0009c(1, 13)), new C0010d(17, new C0009c(1, 9))), new C0011e(2, new C0010d(10, new C0009c(1, 34)), new C0010d(16, new C0009c(1, 28)), new C0010d(22, new C0009c(1, 22)), new C0010d(28, new C0009c(1, 16))), new C0011e(3, new C0010d(15, new C0009c(1, 55)), new C0010d(26, new C0009c(1, 44)), new C0010d(18, new C0009c(2, 17)), new C0010d(22, new C0009c(2, 13))), new C0011e(4, new C0010d(20, new C0009c(1, 80)), new C0010d(18, new C0009c(2, 32)), new C0010d(26, new C0009c(2, 24)), new C0010d(16, new C0009c(4, 9))), new C0011e(5, new C0010d(26, new C0009c(1, 108)), new C0010d(24, new C0009c(2, 43)), new C0010d(18, new C0009c(2, 15), new C0009c(2, 16)), new C0010d(22, new C0009c(2, 11), new C0009c(2, 12))), new C0011e(6, new C0010d(18, new C0009c(2, 68)), new C0010d(16, new C0009c(4, 27)), new C0010d(24, new C0009c(4, 19)), new C0010d(28, new C0009c(4, 15))), new C0011e(7, new C0010d(20, new C0009c(2, 78)), new C0010d(18, new C0009c(4, 31)), new C0010d(18, new C0009c(2, 14), new C0009c(4, 15)), new C0010d(26, new C0009c(4, 13), new C0009c(1, 14))), new C0011e(8, new C0010d(24, new C0009c(2, 97)), new C0010d(22, new C0009c(2, 38), new C0009c(2, 39)), new C0010d(22, new C0009c(4, 18), new C0009c(2, 19)), new C0010d(26, new C0009c(4, 14), new C0009c(2, 15))), new C0011e(9, new C0010d(30, new C0009c(2, 116)), new C0010d(22, new C0009c(3, 36), new C0009c(2, 37)), new C0010d(20, new C0009c(4, 16), new C0009c(4, 17)), new C0010d(24, new C0009c(4, 12), new C0009c(4, 13))), new C0011e(10, new C0010d(18, new C0009c(2, 68), new C0009c(2, 69)), new C0010d(26, new C0009c(4, 43), new C0009c(1, 44)), new C0010d(24, new C0009c(6, 19), new C0009c(2, 20)), new C0010d(28, new C0009c(6, 15), new C0009c(2, 16))), new C0011e(11, new C0010d(20, new C0009c(4, 81)), new C0010d(30, new C0009c(1, 50), new C0009c(4, 51)), new C0010d(28, new C0009c(4, 22), new C0009c(4, 23)), new C0010d(24, new C0009c(3, 12), new C0009c(8, 13))), new C0011e(12, new C0010d(24, new C0009c(2, 92), new C0009c(2, 93)), new C0010d(22, new C0009c(6, 36), new C0009c(2, 37)), new C0010d(26, new C0009c(4, 20), new C0009c(6, 21)), new C0010d(28, new C0009c(7, 14), new C0009c(4, 15))), new C0011e(13, new C0010d(26, new C0009c(4, 107)), new C0010d(22, new C0009c(8, 37), new C0009c(1, 38)), new C0010d(24, new C0009c(8, 20), new C0009c(4, 21)), new C0010d(22, new C0009c(12, 11), new C0009c(4, 12))), new C0011e(14, new C0010d(30, new C0009c(3, 115), new C0009c(1, 116)), new C0010d(24, new C0009c(4, 40), new C0009c(5, 41)), new C0010d(20, new C0009c(11, 16), new C0009c(5, 17)), new C0010d(24, new C0009c(11, 12), new C0009c(5, 13))), new C0011e(15, new C0010d(22, new C0009c(5, 87), new C0009c(1, 88)), new C0010d(24, new C0009c(5, 41), new C0009c(5, 42)), new C0010d(30, new C0009c(5, 24), new C0009c(7, 25)), new C0010d(24, new C0009c(11, 12), new C0009c(7, 13))), new C0011e(16, new C0010d(24, new C0009c(5, 98), new C0009c(1, 99)), new C0010d(28, new C0009c(7, 45), new C0009c(3, 46)), new C0010d(24, new C0009c(15, 19), new C0009c(2, 20)), new C0010d(30, new C0009c(3, 15), new C0009c(13, 16))), new C0011e(17, new C0010d(28, new C0009c(1, 107), new C0009c(5, 108)), new C0010d(28, new C0009c(10, 46), new C0009c(1, 47)), new C0010d(28, new C0009c(1, 22), new C0009c(15, 23)), new C0010d(28, new C0009c(2, 14), new C0009c(17, 15))), new C0011e(18, new C0010d(30, new C0009c(5, 120), new C0009c(1, 121)), new C0010d(26, new C0009c(9, 43), new C0009c(4, 44)), new C0010d(28, new C0009c(17, 22), new C0009c(1, 23)), new C0010d(28, new C0009c(2, 14), new C0009c(19, 15))), new C0011e(19, new C0010d(28, new C0009c(3, 113), new C0009c(4, 114)), new C0010d(26, new C0009c(3, 44), new C0009c(11, 45)), new C0010d(26, new C0009c(17, 21), new C0009c(4, 22)), new C0010d(26, new C0009c(9, 13), new C0009c(16, 14))), new C0011e(20, new C0010d(28, new C0009c(3, 107), new C0009c(5, 108)), new C0010d(26, new C0009c(3, 41), new C0009c(13, 42)), new C0010d(30, new C0009c(15, 24), new C0009c(5, 25)), new C0010d(28, new C0009c(15, 15), new C0009c(10, 16))), new C0011e(21, new C0010d(28, new C0009c(4, 116), new C0009c(4, 117)), new C0010d(26, new C0009c(17, 42)), new C0010d(28, new C0009c(17, 22), new C0009c(6, 23)), new C0010d(30, new C0009c(19, 16), new C0009c(6, 17))), new C0011e(22, new C0010d(28, new C0009c(2, 111), new C0009c(7, 112)), new C0010d(28, new C0009c(17, 46)), new C0010d(30, new C0009c(7, 24), new C0009c(16, 25)), new C0010d(24, new C0009c(34, 13))), new C0011e(23, new C0010d(30, new C0009c(4, 121), new C0009c(5, 122)), new C0010d(28, new C0009c(4, 47), new C0009c(14, 48)), new C0010d(30, new C0009c(11, 24), new C0009c(14, 25)), new C0010d(30, new C0009c(16, 15), new C0009c(14, 16))), new C0011e(24, new C0010d(30, new C0009c(6, 117), new C0009c(4, 118)), new C0010d(28, new C0009c(6, 45), new C0009c(14, 46)), new C0010d(30, new C0009c(11, 24), new C0009c(16, 25)), new C0010d(30, new C0009c(30, 16), new C0009c(2, 17))), new C0011e(25, new C0010d(26, new C0009c(8, 106), new C0009c(4, 107)), new C0010d(28, new C0009c(8, 47), new C0009c(13, 48)), new C0010d(30, new C0009c(7, 24), new C0009c(22, 25)), new C0010d(30, new C0009c(22, 15), new C0009c(13, 16))), new C0011e(26, new C0010d(28, new C0009c(10, 114), new C0009c(2, 115)), new C0010d(28, new C0009c(19, 46), new C0009c(4, 47)), new C0010d(28, new C0009c(28, 22), new C0009c(6, 23)), new C0010d(30, new C0009c(33, 16), new C0009c(4, 17))), new C0011e(27, new C0010d(30, new C0009c(8, 122), new C0009c(4, 123)), new C0010d(28, new C0009c(22, 45), new C0009c(3, 46)), new C0010d(30, new C0009c(8, 23), new C0009c(26, 24)), new C0010d(30, new C0009c(12, 15), new C0009c(28, 16))), new C0011e(28, new C0010d(30, new C0009c(3, 117), new C0009c(10, 118)), new C0010d(28, new C0009c(3, 45), new C0009c(23, 46)), new C0010d(30, new C0009c(4, 24), new C0009c(31, 25)), new C0010d(30, new C0009c(11, 15), new C0009c(31, 16))), new C0011e(29, new C0010d(30, new C0009c(7, 116), new C0009c(7, 117)), new C0010d(28, new C0009c(21, 45), new C0009c(7, 46)), new C0010d(30, new C0009c(1, 23), new C0009c(37, 24)), new C0010d(30, new C0009c(19, 15), new C0009c(26, 16))), new C0011e(30, new C0010d(30, new C0009c(5, 115), new C0009c(10, 116)), new C0010d(28, new C0009c(19, 47), new C0009c(10, 48)), new C0010d(30, new C0009c(15, 24), new C0009c(25, 25)), new C0010d(30, new C0009c(23, 15), new C0009c(25, 16))), new C0011e(31, new C0010d(30, new C0009c(13, 115), new C0009c(3, 116)), new C0010d(28, new C0009c(2, 46), new C0009c(29, 47)), new C0010d(30, new C0009c(42, 24), new C0009c(1, 25)), new C0010d(30, new C0009c(23, 15), new C0009c(28, 16))), new C0011e(32, new C0010d(30, new C0009c(17, 115)), new C0010d(28, new C0009c(10, 46), new C0009c(23, 47)), new C0010d(30, new C0009c(10, 24), new C0009c(35, 25)), new C0010d(30, new C0009c(19, 15), new C0009c(35, 16))), new C0011e(33, new C0010d(30, new C0009c(17, 115), new C0009c(1, 116)), new C0010d(28, new C0009c(14, 46), new C0009c(21, 47)), new C0010d(30, new C0009c(29, 24), new C0009c(19, 25)), new C0010d(30, new C0009c(11, 15), new C0009c(46, 16))), new C0011e(34, new C0010d(30, new C0009c(13, 115), new C0009c(6, 116)), new C0010d(28, new C0009c(14, 46), new C0009c(23, 47)), new C0010d(30, new C0009c(44, 24), new C0009c(7, 25)), new C0010d(30, new C0009c(59, 16), new C0009c(1, 17))), new C0011e(35, new C0010d(30, new C0009c(12, 121), new C0009c(7, 122)), new C0010d(28, new C0009c(12, 47), new C0009c(26, 48)), new C0010d(30, new C0009c(39, 24), new C0009c(14, 25)), new C0010d(30, new C0009c(22, 15), new C0009c(41, 16))), new C0011e(36, new C0010d(30, new C0009c(6, 121), new C0009c(14, 122)), new C0010d(28, new C0009c(6, 47), new C0009c(34, 48)), new C0010d(30, new C0009c(46, 24), new C0009c(10, 25)), new C0010d(30, new C0009c(2, 15), new C0009c(64, 16))), new C0011e(37, new C0010d(30, new C0009c(17, 122), new C0009c(4, 123)), new C0010d(28, new C0009c(29, 46), new C0009c(14, 47)), new C0010d(30, new C0009c(49, 24), new C0009c(10, 25)), new C0010d(30, new C0009c(24, 15), new C0009c(46, 16))), new C0011e(38, new C0010d(30, new C0009c(4, 122), new C0009c(18, 123)), new C0010d(28, new C0009c(13, 46), new C0009c(32, 47)), new C0010d(30, new C0009c(48, 24), new C0009c(14, 25)), new C0010d(30, new C0009c(42, 15), new C0009c(32, 16))), new C0011e(39, new C0010d(30, new C0009c(20, 117), new C0009c(4, 118)), new C0010d(28, new C0009c(40, 47), new C0009c(7, 48)), new C0010d(30, new C0009c(43, 24), new C0009c(22, 25)), new C0010d(30, new C0009c(10, 15), new C0009c(67, 16))), new C0011e(40, new C0010d(30, new C0009c(19, 118), new C0009c(6, 119)), new C0010d(28, new C0009c(18, 47), new C0009c(31, 48)), new C0010d(30, new C0009c(34, 24), new C0009c(34, 25)), new C0010d(30, new C0009c(20, 15), new C0009c(61, 16)))};
    }

    /* renamed from: e */
    public static C0011e m1486e(int i) {
        if (i <= 0 || i > 40) {
            throw new IllegalArgumentException();
        }
        return f67d[i - 1];
    }

    /* renamed from: b */
    public final int m1489b() {
        return (this.f68a * 4) + 17;
    }

    /* renamed from: c */
    public final C0010d m1488c(int i) {
        C0010d[] c0010dArr = this.f69b;
        if (i != 0) {
            return c0010dArr[i - 1];
        }
        throw null;
    }

    /* renamed from: d */
    public final int m1487d() {
        return this.f70c;
    }

    /* renamed from: f */
    public final int m1485f() {
        return this.f68a;
    }

    public final String toString() {
        return String.valueOf(this.f68a);
    }
}
