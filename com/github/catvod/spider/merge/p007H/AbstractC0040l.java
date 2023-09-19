package com.github.catvod.spider.merge.p007H;

import com.github.catvod.spider.merge.atm;
import java.util.Iterator;

/* renamed from: com.github.catvod.spider.merge.H.l */
/* loaded from: classes.dex */
public abstract class AbstractC0040l implements Iterator<Integer> {
    /* renamed from: b */
    public abstract int mo1400b();

    @Override // java.util.Iterator
    public final Integer next() {
        return Integer.valueOf(mo1400b());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException(atm.m897d("250A1F072D2C03151455252B4A1415016C2B1F0A0A1A3E2C0F1E5A13232A4A081F1428750514160C6C3B051616102F2C031514"));
    }
}
