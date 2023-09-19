package com.github.catvod.spider.merge.p064z;

import com.github.catvod.spider.merge.atm;
import java.util.Arrays;

/* renamed from: com.github.catvod.spider.merge.z.b */
/* loaded from: classes.dex */
public final class C0752b implements Cloneable {

    /* renamed from: a */
    private final int f1408a;

    /* renamed from: b */
    private final int f1409b;

    /* renamed from: c */
    private final int f1410c;

    /* renamed from: d */
    private final int[] f1411d;

    public C0752b(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException(atm.m897d("28150E1D6C3C03171F1B3F3105140955212D190E5A1729780D081F14383D185A0E1D2D364A4A"));
        }
        this.f1408a = i;
        this.f1409b = i2;
        int i3 = (i + 31) / 32;
        this.f1410c = i3;
        this.f1411d = new int[i3 * i2];
    }

    private C0752b(int i, int i2, int i3, int[] iArr) {
        this.f1408a = i;
        this.f1409b = i2;
        this.f1410c = i3;
        this.f1411d = iArr;
    }

    /* renamed from: a */
    public final boolean m5a(int i, int i2) {
        return ((this.f1411d[(i / 32) + (i2 * this.f1410c)] >>> (i & 31)) & 1) != 0;
    }

    /* renamed from: b */
    public final int m4b() {
        return this.f1409b;
    }

    /* renamed from: c */
    public final int m3c() {
        return this.f1408a;
    }

    public final Object clone() {
        return new C0752b(this.f1408a, this.f1409b, this.f1410c, (int[]) this.f1411d.clone());
    }

    /* renamed from: d */
    public final void m2d(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            throw new IllegalArgumentException(atm.m897d("261F1C016C39041E5A0123284A170F063878081F5A1B2336041F1D1438311C1F"));
        }
        if (i4 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException(atm.m897d("221F1312242C4A1B14116C2F031E0E1D6C351F090E552E3D4A1B0E55203D0B090E557D"));
        }
        int i5 = i3 + i;
        int i6 = i4 + i2;
        if (i6 > this.f1409b || i5 > this.f1408a) {
            throw new IllegalArgumentException(atm.m897d("3E121F553E3D0D13151B6C351F090E552A311E5A131B3F310E1F5A01243D4A171B013E3112"));
        }
        while (i2 < i6) {
            int i7 = this.f1410c * i2;
            for (int i8 = i; i8 < i5; i8++) {
                int[] iArr = this.f1411d;
                int i9 = (i8 / 32) + i7;
                iArr[i9] = iArr[i9] | (1 << (i8 & 31));
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0752b) {
            C0752b c0752b = (C0752b) obj;
            return this.f1408a == c0752b.f1408a && this.f1409b == c0752b.f1409b && this.f1410c == c0752b.f1410c && Arrays.equals(this.f1411d, c0752b.f1411d);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f1408a;
        return Arrays.hashCode(this.f1411d) + (((((((i * 31) + i) * 31) + this.f1409b) * 31) + this.f1410c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f1408a + 1) * this.f1409b);
        for (int i = 0; i < this.f1409b; i++) {
            for (int i2 = 0; i2 < this.f1408a; i2++) {
                sb.append(m5a(i2, i) ? atm.m897d("325A") : atm.m897d("4A5A"));
            }
            sb.append(atm.m897d("60"));
        }
        return sb.toString();
    }
}
