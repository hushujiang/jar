package com.github.catvod.spider.merge.p013N;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p016Q.C0188j;
import java.util.Locale;

/* renamed from: com.github.catvod.spider.merge.N.t */
/* loaded from: classes.dex */
public final class C0095t extends C0101z {

    /* renamed from: f */
    private final int f164f;

    public C0095t(AbstractC0094s abstractC0094s, InterfaceC0079d interfaceC0079d, int i) {
        super(abstractC0094s, interfaceC0079d, null);
        this.f164f = i;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        String str;
        char[] charArray;
        String m897d;
        int i = this.f164f;
        if (i < 0 || i >= ((InterfaceC0079d) m1313b()).size()) {
            str = "";
        } else {
            int i2 = this.f164f;
            String mo1366c = ((InterfaceC0079d) m1313b()).mo1366c(C0188j.m1206b(i2, i2));
            StringBuilder sb = new StringBuilder();
            for (char c : mo1366c.toCharArray()) {
                if (c == '\t') {
                    m897d = atm.m897d("360E");
                } else if (c == '\n') {
                    m897d = atm.m897d("3614");
                } else if (c == '\r') {
                    m897d = atm.m897d("3608");
                } else {
                    sb.append(c);
                }
                sb.append(m897d);
            }
            str = sb.toString();
        }
        return String.format(Locale.getDefault(), atm.m897d("4F095252692B4D53"), C0095t.class.getSimpleName(), str);
    }
}
