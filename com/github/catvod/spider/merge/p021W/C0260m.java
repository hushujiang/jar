package com.github.catvod.spider.merge.p021W;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p028c.C0424a;
import java.text.ParsePosition;
import java.util.Calendar;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.W.m */
/* loaded from: classes.dex */
public class C0260m extends AbstractC0262o {

    /* renamed from: a */
    private final int f458a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0260m(int i) {
        super(null);
        this.f458a = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p021W.AbstractC0262o
    /* renamed from: a */
    public final boolean mo1090a() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p021W.AbstractC0262o
    /* renamed from: b */
    public final boolean mo1089b(C0267t c0267t, Calendar calendar, String str, ParsePosition parsePosition, int i) {
        int index = parsePosition.getIndex();
        int length = str.length();
        if (i == 0) {
            while (index < length && Character.isWhitespace(str.charAt(index))) {
                index++;
            }
            parsePosition.setIndex(index);
        } else {
            int i2 = i + index;
            if (length > i2) {
                length = i2;
            }
        }
        while (index < length && Character.isDigit(str.charAt(index))) {
            index++;
        }
        if (parsePosition.getIndex() == index) {
            parsePosition.setErrorIndex(index);
            return false;
        }
        int parseInt = Integer.parseInt(str.substring(parsePosition.getIndex(), index));
        parsePosition.setIndex(index);
        calendar.set(this.f458a, mo1091c(c0267t, parseInt));
        return true;
    }

    /* renamed from: c */
    int mo1091c(C0267t c0267t, int i) {
        return i;
    }

    public final String toString() {
        StringBuilder m635a = C0424a.m635a(atm.m897d("240F1717292A390E0814383D0D035A2E2A310F161E48"));
        m635a.append(this.f458a);
        m635a.append(atm.m897d("37"));
        return m635a.toString();
    }
}
