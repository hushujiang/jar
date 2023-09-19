package com.github.catvod.spider.merge.p021W;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p028c.C0424a;
import java.io.IOException;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.github.catvod.spider.merge.W.N */
/* loaded from: classes.dex */
public final class C0244N implements Serializable {

    /* renamed from: f */
    private static final InterfaceC0273z[] f432f = new InterfaceC0273z[0];

    /* renamed from: g */
    private static final ConcurrentMap<C0233C, String> f433g = new ConcurrentHashMap(7);

    /* renamed from: a */
    private final String f434a;

    /* renamed from: b */
    private final TimeZone f435b;

    /* renamed from: c */
    private final Locale f436c;

    /* renamed from: d */
    private transient InterfaceC0273z[] f437d;

    /* renamed from: e */
    private transient int f438e;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:120:0x020e A[LOOP:2: B:118:0x020a->B:120:0x020e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0218 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0244N(java.lang.String r17, java.util.TimeZone r18, java.util.Locale r19) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p021W.C0244N.<init>(java.lang.String, java.util.TimeZone, java.util.Locale):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m1108a(Appendable appendable, int i) {
        StringBuilder sb = (StringBuilder) appendable;
        sb.append((char) ((i / 10) + 48));
        sb.append((char) ((i % 10) + 48));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m1107b(Appendable appendable, int i, int i2) {
        if (i < 10000) {
            int i3 = i < 1000 ? i < 100 ? i < 10 ? 1 : 2 : 3 : 4;
            for (int i4 = i2 - i3; i4 > 0; i4--) {
                ((StringBuilder) appendable).append('0');
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            return;
                        }
                        ((StringBuilder) appendable).append((char) ((i / 1000) + 48));
                        i %= 1000;
                    }
                    if (i >= 100) {
                        ((StringBuilder) appendable).append((char) ((i / 100) + 48));
                        i %= 100;
                    } else {
                        ((StringBuilder) appendable).append('0');
                    }
                }
                if (i >= 10) {
                    ((StringBuilder) appendable).append((char) ((i / 10) + 48));
                    i %= 10;
                } else {
                    ((StringBuilder) appendable).append('0');
                }
            }
            ((StringBuilder) appendable).append((char) (i + 48));
            return;
        }
        char[] cArr = new char[10];
        int i5 = 0;
        while (i != 0) {
            cArr[i5] = (char) ((i % 10) + 48);
            i /= 10;
            i5++;
        }
        while (i5 < i2) {
            ((StringBuilder) appendable).append('0');
            i2--;
        }
        while (true) {
            i5--;
            if (i5 < 0) {
                return;
            }
            ((StringBuilder) appendable).append(cArr[i5]);
        }
    }

    /* renamed from: c */
    private String m1106c(Calendar calendar) {
        StringBuilder sb = new StringBuilder(this.f438e);
        try {
            for (InterfaceC0273z interfaceC0273z : this.f437d) {
                interfaceC0273z.mo1075b(sb, calendar);
            }
            return sb.toString();
        } catch (IOException e) {
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<com.github.catvod.spider.merge.W.C, java.lang.String>] */
    /* renamed from: h */
    public static String m1101h(TimeZone timeZone, boolean z, int i, Locale locale) {
        C0233C c0233c = new C0233C(timeZone, z, i, locale);
        ?? r1 = f433g;
        String str = (String) r1.get(c0233c);
        if (str == null) {
            String displayName = timeZone.getDisplayName(z, i, locale);
            String str2 = (String) r1.putIfAbsent(c0233c, displayName);
            return str2 != null ? str2 : displayName;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final String m1105d(Object obj) {
        if (obj instanceof Date) {
            Calendar calendar = Calendar.getInstance(this.f435b, this.f436c);
            calendar.setTime((Date) obj);
            return m1106c(calendar);
        } else if (obj instanceof Calendar) {
            Calendar calendar2 = (Calendar) obj;
            StringBuilder sb = new StringBuilder(this.f438e);
            if (!calendar2.getTimeZone().equals(this.f435b)) {
                calendar2 = (Calendar) calendar2.clone();
                calendar2.setTimeZone(this.f435b);
            }
            try {
                for (InterfaceC0273z interfaceC0273z : this.f437d) {
                    interfaceC0273z.mo1075b(sb, calendar2);
                }
                return sb.toString();
            } catch (IOException e) {
                throw e;
            }
        } else if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            Calendar calendar3 = Calendar.getInstance(this.f435b, this.f436c);
            calendar3.setTimeInMillis(longValue);
            return m1106c(calendar3);
        } else {
            StringBuilder m635a = C0424a.m635a(atm.m897d("3F14111B232F045A19192D2B19405A"));
            m635a.append(obj == null ? atm.m897d("56140F192066") : obj.getClass().getName());
            throw new IllegalArgumentException(m635a.toString());
        }
    }

    /* renamed from: e */
    public final Locale m1104e() {
        return this.f436c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0244N) {
            C0244N c0244n = (C0244N) obj;
            return this.f434a.equals(c0244n.f434a) && this.f435b.equals(c0244n.f435b) && this.f436c.equals(c0244n.f436c);
        }
        return false;
    }

    /* renamed from: f */
    public final String m1103f() {
        return this.f434a;
    }

    /* renamed from: g */
    public final TimeZone m1102g() {
        return this.f435b;
    }

    public final int hashCode() {
        return (((this.f436c.hashCode() * 13) + this.f435b.hashCode()) * 13) + this.f434a.hashCode();
    }

    /* renamed from: i */
    protected final InterfaceC0271x m1100i(int i, int i2) {
        return i2 != 1 ? i2 != 2 ? new C0272y(i, i2) : new C0239I(i) : new C0242L(i);
    }

    public final String toString() {
        StringBuilder m635a = C0424a.m635a(atm.m897d("2C1B090108391E1F2A0725361E1F082E"));
        m635a.append(this.f434a);
        String m897d = atm.m897d("46");
        m635a.append(m897d);
        m635a.append(this.f436c);
        m635a.append(m897d);
        m635a.append(this.f435b.getID());
        m635a.append(atm.m897d("37"));
        return m635a.toString();
    }
}
