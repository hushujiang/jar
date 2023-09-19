package com.github.catvod.spider.merge.p021W;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p028c.C0424a;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.github.catvod.spider.merge.W.c */
/* loaded from: classes.dex */
public final class C0250c extends Format {

    /* renamed from: c */
    private static final C0249b f448c = new C0249b();

    /* renamed from: a */
    private final C0244N f449a;

    /* renamed from: b */
    private final C0267t f450b;

    /* JADX INFO: Access modifiers changed from: protected */
    public C0250c(String str, TimeZone timeZone, Locale locale) {
        this.f449a = new C0244N(str, timeZone, locale);
        this.f450b = new C0267t(str, timeZone, locale);
    }

    /* renamed from: a */
    public static C0250c m1097a() {
        return (C0250c) f448c.m1098a(atm.m897d("2F3F3F596C3C0E5A373801781303030C6C1022401718762B195A20"), Locale.US);
    }

    /* renamed from: b */
    public static C0250c m1096b(String str) {
        return (C0250c) f448c.m1098a(str, null);
    }

    /* renamed from: c */
    public final Date m1095c(String str) {
        return this.f450b.m1079h(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0250c) {
            return this.f449a.equals(((C0250c) obj).f449a);
        }
        return false;
    }

    @Override // java.text.Format
    public final StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        stringBuffer.append(this.f449a.m1105d(obj));
        return stringBuffer;
    }

    public final int hashCode() {
        return this.f449a.hashCode();
    }

    @Override // java.text.Format
    public final Object parseObject(String str, ParsePosition parsePosition) {
        return this.f450b.m1078i(str, parsePosition);
    }

    public final String toString() {
        StringBuilder m635a = C0424a.m635a(atm.m897d("2C1B090108391E1F3C1A3E350B0E21"));
        m635a.append(this.f449a.m1103f());
        String m897d = atm.m897d("46");
        m635a.append(m897d);
        m635a.append(this.f449a.m1104e());
        m635a.append(m897d);
        m635a.append(this.f449a.m1102g().getID());
        m635a.append(atm.m897d("37"));
        return m635a.toString();
    }
}
