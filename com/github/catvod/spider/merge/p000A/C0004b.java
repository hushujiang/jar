package com.github.catvod.spider.merge.p000A;

import com.github.catvod.spider.merge.atm;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.A.b */
/* loaded from: classes.dex */
public final class C0004b {

    /* renamed from: a */
    private final C0003a f51a;

    /* renamed from: b */
    private final int[] f52b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0004b(C0003a c0003a, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f51a = c0003a;
        int length = iArr.length;
        if (length <= 1 || iArr[0] != 0) {
            this.f52b = iArr;
            return;
        }
        int i = 1;
        while (i < length && iArr[i] == 0) {
            i++;
        }
        if (i == length) {
            this.f52b = new int[]{0};
            return;
        }
        int i2 = length - i;
        int[] iArr2 = new int[i2];
        this.f52b = iArr2;
        System.arraycopy(iArr, i, iArr2, 0, i2);
    }

    /* renamed from: a */
    final C0004b m1510a(C0004b c0004b) {
        if (this.f51a.equals(c0004b.f51a)) {
            if (m1506e()) {
                return c0004b;
            }
            if (c0004b.m1506e()) {
                return this;
            }
            int[] iArr = this.f52b;
            int[] iArr2 = c0004b.f52b;
            if (iArr.length <= iArr2.length) {
                iArr = iArr2;
                iArr2 = iArr;
            }
            int[] iArr3 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr3, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr3[i] = iArr2[i - length] ^ iArr[i];
            }
            return new C0004b(this.f51a, iArr3);
        }
        throw new IllegalArgumentException(atm.m897d("2D1F14103E31093D3C25233413095A11237804150E5524391C1F5A062D350F5A3D10223D181319320A780C131F1928"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final C0004b[] m1509b(C0004b c0004b) {
        if (this.f51a.equals(c0004b.f51a)) {
            if (c0004b.m1506e()) {
                throw new IllegalArgumentException(atm.m897d("2E130C1C283D4A1803557C"));
            }
            C0004b m1514d = this.f51a.m1514d();
            int m1513e = this.f51a.m1513e(c0004b.m1508c(c0004b.f52b.length - 1));
            C0004b c0004b2 = this;
            while (c0004b2.f52b.length - 1 >= c0004b.f52b.length - 1 && !c0004b2.m1506e()) {
                int[] iArr = c0004b2.f52b;
                int length = (iArr.length - 1) - (c0004b.f52b.length - 1);
                int m1511g = this.f51a.m1511g(c0004b2.m1508c(iArr.length - 1), m1513e);
                C0004b m1504g = c0004b.m1504g(length, m1511g);
                m1514d = m1514d.m1510a(this.f51a.m1517a(length, m1511g));
                c0004b2 = c0004b2.m1510a(m1504g);
            }
            return new C0004b[]{m1514d, c0004b2};
        }
        throw new IllegalArgumentException(atm.m897d("2D1F14103E31093D3C25233413095A11237804150E5524391C1F5A062D350F5A3D10223D181319320A780C131F1928"));
    }

    /* renamed from: c */
    final int m1508c(int i) {
        int[] iArr = this.f52b;
        return iArr[(iArr.length - 1) - i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final int[] m1507d() {
        return this.f52b;
    }

    /* renamed from: e */
    final boolean m1506e() {
        return this.f52b[0] == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final C0004b m1505f(C0004b c0004b) {
        if (this.f51a.equals(c0004b.f51a)) {
            if (m1506e() || c0004b.m1506e()) {
                return this.f51a.m1514d();
            }
            int[] iArr = this.f52b;
            int length = iArr.length;
            int[] iArr2 = c0004b.f52b;
            int length2 = iArr2.length;
            int[] iArr3 = new int[(length + length2) - 1];
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                for (int i3 = 0; i3 < length2; i3++) {
                    int i4 = i + i3;
                    iArr3[i4] = iArr3[i4] ^ this.f51a.m1511g(i2, iArr2[i3]);
                }
            }
            return new C0004b(this.f51a, iArr3);
        }
        throw new IllegalArgumentException(atm.m897d("2D1F14103E31093D3C25233413095A11237804150E5524391C1F5A062D350F5A3D10223D181319320A780C131F1928"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final C0004b m1504g(int i, int i2) {
        if (i >= 0) {
            if (i2 == 0) {
                return this.f51a.m1514d();
            }
            int length = this.f52b.length;
            int[] iArr = new int[i + length];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.f51a.m1511g(this.f52b[i3], i2);
            }
            return new C0004b(this.f51a, iArr);
        }
        throw new IllegalArgumentException();
    }

    public final String toString() {
        char c;
        StringBuilder sb = new StringBuilder((this.f52b.length - 1) * 8);
        int length = this.f52b.length;
        while (true) {
            length--;
            if (length < 0) {
                return sb.toString();
            }
            int m1508c = m1508c(length);
            if (m1508c != 0) {
                if (m1508c < 0) {
                    sb.append(atm.m897d("4A575A"));
                    m1508c = -m1508c;
                } else if (sb.length() > 0) {
                    sb.append(atm.m897d("4A515A"));
                }
                if (length == 0 || m1508c != 1) {
                    int m1512f = this.f51a.m1512f(m1508c);
                    if (m1512f == 0) {
                        c = '1';
                    } else if (m1512f == 1) {
                        c = 'a';
                    } else {
                        sb.append(atm.m897d("0B24"));
                        sb.append(m1512f);
                    }
                    sb.append(c);
                }
                if (length != 0) {
                    if (length == 1) {
                        sb.append('x');
                    } else {
                        sb.append(atm.m897d("1224"));
                        sb.append(length);
                    }
                }
            }
        }
    }
}
