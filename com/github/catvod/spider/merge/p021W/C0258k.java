package com.github.catvod.spider.merge.p021W;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p028c.C0424a;
import java.text.ParsePosition;
import java.util.Calendar;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.W.k */
/* loaded from: classes.dex */
public final class C0258k extends AbstractC0262o {

    /* renamed from: a */
    private final String f454a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0258k(String str) {
        super(null);
        this.f454a = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p021W.AbstractC0262o
    /* renamed from: b */
    public final boolean mo1089b(C0267t c0267t, Calendar calendar, String str, ParsePosition parsePosition, int i) {
        for (int i2 = 0; i2 < this.f454a.length(); i2++) {
            int index = parsePosition.getIndex() + i2;
            if (index == str.length()) {
                parsePosition.setErrorIndex(index);
                return false;
            } else if (this.f454a.charAt(i2) != str.charAt(index)) {
                parsePosition.setErrorIndex(index);
                return false;
            }
        }
        parsePosition.setIndex(parsePosition.getIndex() + this.f454a.length());
        return true;
    }

    public final String toString() {
        StringBuilder m635a = C0424a.m635a(atm.m897d("29150A0C1D2D050E1F111F2C181B0E102B214A211C1A3E350B0E3C1C29340E47"));
        m635a.append(this.f454a);
        m635a.append(atm.m897d("37"));
        return m635a.toString();
    }
}
