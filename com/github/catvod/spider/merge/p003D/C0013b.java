package com.github.catvod.spider.merge.p003D;

import com.github.catvod.spider.merge.atm;
import java.lang.reflect.Array;

/* renamed from: com.github.catvod.spider.merge.D.b */
/* loaded from: classes.dex */
public final class C0013b {

    /* renamed from: a */
    private final byte[][] f73a;

    /* renamed from: b */
    private final int f74b;

    /* renamed from: c */
    private final int f75c;

    public C0013b(int i, int i2) {
        this.f73a = (byte[][]) Array.newInstance(byte.class, i2, i);
        this.f74b = i;
        this.f75c = i2;
    }

    /* renamed from: a */
    public final void m1482a() {
        for (int i = 0; i < this.f75c; i++) {
            for (int i2 = 0; i2 < this.f74b; i2++) {
                this.f73a[i][i2] = -1;
            }
        }
    }

    /* renamed from: b */
    public final byte m1481b(int i, int i2) {
        return this.f73a[i2][i];
    }

    /* renamed from: c */
    public final byte[][] m1480c() {
        return this.f73a;
    }

    /* renamed from: d */
    public final int m1479d() {
        return this.f75c;
    }

    /* renamed from: e */
    public final int m1478e() {
        return this.f74b;
    }

    /* renamed from: f */
    public final void m1477f(int i, int i2, int i3) {
        this.f73a[i2][i] = (byte) i3;
    }

    /* renamed from: g */
    public final void m1476g(int i, int i2, boolean z) {
        this.f73a[i2][i] = z ? (byte) 1 : (byte) 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f74b * 2 * this.f75c) + 2);
        for (int i = 0; i < this.f75c; i++) {
            for (int i2 = 0; i2 < this.f74b; i2++) {
                byte b = this.f73a[i][i2];
                sb.append(b != 0 ? b != 1 ? atm.m897d("4A5A") : atm.m897d("4A4B") : atm.m897d("4A4A"));
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
