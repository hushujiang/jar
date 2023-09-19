package com.github.catvod.spider.merge.p011L;

import com.github.catvod.spider.merge.atm;
import java.util.Iterator;

/* renamed from: com.github.catvod.spider.merge.L.a */
/* loaded from: classes.dex */
public class C0054a implements Iterable<Integer> {

    /* renamed from: a */
    private final int f99a;

    /* renamed from: b */
    private final int f100b;

    /* renamed from: c */
    private final int f101c;

    public C0054a(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException(atm.m897d("390E1F056C351F090E552E3D4A14151B61220F08155B"));
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f99a = i;
            if (i3 > 0) {
                if (i < i2) {
                    int i4 = i2 % i3;
                    int i5 = i % i3;
                    int i6 = ((i4 < 0 ? i4 + i3 : i4) - (i5 < 0 ? i5 + i3 : i5)) % i3;
                    i2 -= i6 < 0 ? i6 + i3 : i6;
                }
            } else if (i3 >= 0) {
                throw new IllegalArgumentException(atm.m897d("390E1F056C31195A00103E3744"));
            } else {
                if (i > i2) {
                    int i7 = -i3;
                    int i8 = i % i7;
                    int i9 = i2 % i7;
                    int i10 = ((i8 < 0 ? i8 + i7 : i8) - (i9 < 0 ? i9 + i7 : i9)) % i7;
                    i2 += i10 < 0 ? i10 + i7 : i10;
                }
            }
            this.f100b = i2;
            this.f101c = i3;
            return;
        }
        throw new IllegalArgumentException(atm.m897d("390E1F056C351F090E552E3D4A1D08102D2C0F085A012439045A331B38762733342A1A19262F3F5538374A1B0C1A253C4A150C103E3E06150D5523364A141F122D2C0315145B"));
    }

    /* renamed from: a */
    public final int m1403a() {
        return this.f99a;
    }

    /* renamed from: b */
    public final int m1402b() {
        return this.f100b;
    }

    /* renamed from: c */
    public final int m1401c() {
        return this.f101c;
    }

    @Override // java.lang.Iterable
    public final Iterator<Integer> iterator() {
        return new C0055b(this.f99a, this.f100b, this.f101c);
    }
}
