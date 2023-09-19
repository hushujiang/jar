package com.github.catvod.spider.merge.p010K;

import com.github.catvod.spider.merge.atm;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.github.catvod.spider.merge.K.a */
/* loaded from: classes.dex */
final class C0048a<T> implements Iterator<T> {

    /* renamed from: a */
    private int f96a;

    /* renamed from: b */
    private final T[] f97b;

    public C0048a(T[] tArr) {
        C0053f.m1406d(tArr, atm.m897d("0B08081435"));
        this.f97b = tArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f96a < this.f97b.length;
    }

    @Override // java.util.Iterator
    public final T next() {
        try {
            T[] tArr = this.f97b;
            int i = this.f96a;
            this.f96a = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f96a--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException(atm.m897d("250A1F072D2C03151455252B4A1415016C2B1F0A0A1A3E2C0F1E5A13232A4A081F1428750514160C6C3B051616102F2C031514"));
    }
}
