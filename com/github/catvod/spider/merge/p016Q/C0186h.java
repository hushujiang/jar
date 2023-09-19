package com.github.catvod.spider.merge.p016Q;

import java.util.Arrays;

/* renamed from: com.github.catvod.spider.merge.Q.h */
/* loaded from: classes.dex */
public class C0186h {

    /* renamed from: c */
    private static int[] f339c = new int[0];

    /* renamed from: a */
    private int[] f340a = f339c;

    /* renamed from: b */
    private int f341b;

    /* renamed from: a */
    public final void m1213a(int i) {
        int[] iArr = this.f340a;
        int length = iArr.length;
        int i2 = this.f341b;
        if (length == i2) {
            int i3 = i2 + 1;
            if (i3 < 0 || i3 > 2147483639) {
                throw new OutOfMemoryError();
            }
            int length2 = iArr.length == 0 ? 4 : iArr.length;
            while (length2 < i3) {
                length2 *= 2;
                if (length2 < 0 || length2 > 2147483639) {
                    length2 = 2147483639;
                }
            }
            this.f340a = Arrays.copyOf(this.f340a, length2);
        }
        int[] iArr2 = this.f340a;
        int i4 = this.f341b;
        iArr2[i4] = i;
        this.f341b = i4 + 1;
    }

    /* renamed from: b */
    public final void m1212b() {
        Arrays.fill(this.f340a, 0, this.f341b, 0);
        this.f341b = 0;
    }

    /* renamed from: c */
    public final int m1211c(int i) {
        if (i < 0 || i >= this.f341b) {
            throw new IndexOutOfBoundsException();
        }
        return this.f340a[i];
    }

    /* renamed from: d */
    public final boolean m1210d() {
        return this.f341b == 0;
    }

    /* renamed from: e */
    public final int m1209e(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.f341b)) {
            int[] iArr = this.f340a;
            int i3 = iArr[i];
            System.arraycopy(iArr, i + 1, iArr, i, (i2 - i) - 1);
            int[] iArr2 = this.f340a;
            int i4 = this.f341b;
            iArr2[i4 - 1] = 0;
            this.f341b = i4 - 1;
            return i3;
        }
        throw new IndexOutOfBoundsException();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0186h) {
            C0186h c0186h = (C0186h) obj;
            if (this.f341b != c0186h.f341b) {
                return false;
            }
            for (int i = 0; i < this.f341b; i++) {
                if (this.f340a[i] != c0186h.f340a[i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final int m1208f() {
        return this.f341b;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f341b; i2++) {
            i = (i * 31) + this.f340a[i2];
        }
        return i;
    }

    public final String toString() {
        int i = this.f341b;
        return Arrays.toString(i == 0 ? f339c : Arrays.copyOf(this.f340a, i));
    }
}
