package com.github.catvod.spider.merge.p000A;

import com.github.catvod.spider.merge.atm;

/* renamed from: com.github.catvod.spider.merge.A.a */
/* loaded from: classes.dex */
public final class C0003a {

    /* renamed from: g */
    public static final C0003a f39g = new C0003a(4201, 4096, 1);

    /* renamed from: h */
    public static final C0003a f40h = new C0003a(1033, 1024, 1);

    /* renamed from: i */
    public static final C0003a f41i = new C0003a(67, 64, 1);

    /* renamed from: j */
    public static final C0003a f42j = new C0003a(19, 16, 1);

    /* renamed from: k */
    public static final C0003a f43k = new C0003a(285, 256, 0);

    /* renamed from: l */
    public static final C0003a f44l = new C0003a(301, 256, 1);

    /* renamed from: a */
    private final int[] f45a;

    /* renamed from: b */
    private final int[] f46b;

    /* renamed from: c */
    private final C0004b f47c;

    /* renamed from: d */
    private final int f48d;

    /* renamed from: e */
    private final int f49e;

    /* renamed from: f */
    private final int f50f;

    public C0003a(int i, int i2, int i3) {
        this.f49e = i;
        this.f48d = i2;
        this.f50f = i3;
        this.f45a = new int[i2];
        this.f46b = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.f45a[i5] = i4;
            i4 <<= 1;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.f46b[this.f45a[i6]] = i6;
        }
        this.f47c = new C0004b(this, new int[]{0});
        new C0004b(this, new int[]{1});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final C0004b m1517a(int i, int i2) {
        if (i >= 0) {
            if (i2 == 0) {
                return this.f47c;
            }
            int[] iArr = new int[i + 1];
            iArr[0] = i2;
            return new C0004b(this, iArr);
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final int m1516b(int i) {
        return this.f45a[i];
    }

    /* renamed from: c */
    public final int m1515c() {
        return this.f50f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final C0004b m1514d() {
        return this.f47c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final int m1513e(int i) {
        if (i != 0) {
            return this.f45a[(this.f48d - this.f46b[i]) - 1];
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final int m1512f(int i) {
        if (i != 0) {
            return this.f46b[i];
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final int m1511g(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f45a;
        int[] iArr2 = this.f46b;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.f48d - 1)];
    }

    public final String toString() {
        return atm.m897d("2D3C524534") + Integer.toHexString(this.f49e) + ',' + this.f48d + ')';
    }
}
