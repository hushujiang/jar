package com.github.catvod.spider.merge.p064z;

import com.github.catvod.spider.merge.atm;
import java.util.Arrays;

/* renamed from: com.github.catvod.spider.merge.z.a */
/* loaded from: classes.dex */
public final class C0751a implements Cloneable {

    /* renamed from: a */
    private int[] f1406a;

    /* renamed from: b */
    private int f1407b;

    public C0751a() {
        this.f1407b = 0;
        this.f1406a = new int[1];
    }

    C0751a(int[] iArr, int i) {
        this.f1406a = iArr;
        this.f1407b = i;
    }

    /* renamed from: d */
    private void m10d(int i) {
        int[] iArr = this.f1406a;
        if (i > (iArr.length << 5)) {
            int[] iArr2 = new int[(i + 31) / 32];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f1406a = iArr2;
        }
    }

    /* renamed from: a */
    public final void m13a(boolean z) {
        m10d(this.f1407b + 1);
        if (z) {
            int[] iArr = this.f1406a;
            int i = this.f1407b;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.f1407b++;
    }

    /* renamed from: b */
    public final void m12b(C0751a c0751a) {
        int i = c0751a.f1407b;
        m10d(this.f1407b + i);
        for (int i2 = 0; i2 < i; i2++) {
            m13a(c0751a.m9e(i2));
        }
    }

    /* renamed from: c */
    public final void m11c(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            throw new IllegalArgumentException(atm.m897d("240F17552E311E095A18392B1E5A18106C3A0F0E0D1029364A4A5A14223C4A4948"));
        }
        m10d(this.f1407b + i2);
        while (i2 > 0) {
            boolean z = true;
            if (((i >> (i2 - 1)) & 1) != 1) {
                z = false;
            }
            m13a(z);
            i2--;
        }
    }

    public final Object clone() {
        return new C0751a((int[]) this.f1406a.clone(), this.f1407b);
    }

    /* renamed from: e */
    public final boolean m9e(int i) {
        return ((1 << (i & 31)) & this.f1406a[i / 32]) != 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0751a) {
            C0751a c0751a = (C0751a) obj;
            return this.f1407b == c0751a.f1407b && Arrays.equals(this.f1406a, c0751a.f1406a);
        }
        return false;
    }

    /* renamed from: f */
    public final int m8f() {
        return this.f1407b;
    }

    /* renamed from: g */
    public final int m7g() {
        return (this.f1407b + 7) / 8;
    }

    /* renamed from: h */
    public final void m6h(C0751a c0751a) {
        if (this.f1407b != c0751a.f1407b) {
            throw new IllegalArgumentException(atm.m897d("391300103F780E1514523878071B0E1624"));
        }
        int i = 0;
        while (true) {
            int[] iArr = this.f1406a;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = iArr[i] ^ c0751a.f1406a[i];
            i++;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f1406a) + (this.f1407b * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.f1407b);
        for (int i = 0; i < this.f1407b; i++) {
            if ((i & 7) == 0) {
                sb.append(' ');
            }
            sb.append(m9e(i) ? 'X' : '.');
        }
        return sb.toString();
    }
}
