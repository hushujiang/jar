package com.github.catvod.spider.merge.p021W;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p018S.C0202c;
import com.github.catvod.spider.merge.p028c.C0424a;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.W.j */
/* loaded from: classes.dex */
public final class C0257j extends AbstractC0261n {

    /* renamed from: b */
    private final int f451b;

    /* renamed from: c */
    final Locale f452c;

    /* renamed from: d */
    private final Map<String, Integer> f453d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0257j(int i, Calendar calendar, Locale locale) {
        this.f451b = i;
        this.f452c = C0202c.m1177a(locale);
        StringBuilder m635a = C0424a.m635a(atm.m897d("4252451C3971"));
        this.f453d = (HashMap) C0267t.m1084c(calendar, locale, i, m635a);
        m635a.setLength(m635a.length() - 1);
        m635a.append(atm.m897d("43"));
        this.f459a = Pattern.compile(m635a.toString());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
    @Override // com.github.catvod.spider.merge.p021W.AbstractC0261n
    /* renamed from: c */
    final void mo1087c(Calendar calendar, String str) {
        String lowerCase = str.toLowerCase(this.f452c);
        Integer num = (Integer) this.f453d.get(lowerCase);
        if (num == null) {
            ?? r0 = this.f453d;
            num = (Integer) r0.get(lowerCase + '.');
        }
        calendar.set(this.f451b, num.intValue());
    }

    @Override // com.github.catvod.spider.merge.p021W.AbstractC0261n
    public final String toString() {
        StringBuilder m635a = C0424a.m635a(atm.m897d("291B09100536191F1406252C030C1F2129201E290E072D2C0F1D0355173E031F161171"));
        m635a.append(this.f451b);
        m635a.append(atm.m897d("465A161A2F39061F47"));
        m635a.append(this.f452c);
        m635a.append(atm.m897d("465A163E29213C1B1600292B57"));
        m635a.append(this.f453d);
        m635a.append(atm.m897d("465A0A14382C0F081448"));
        m635a.append(this.f459a);
        m635a.append(atm.m897d("37"));
        return m635a.toString();
    }
}
