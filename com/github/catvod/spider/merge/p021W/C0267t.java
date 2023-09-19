package com.github.catvod.spider.merge.p021W;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p018S.C0202c;
import com.github.catvod.spider.merge.p028c.C0424a;
import com.github.catvod.spider.merge.p054p.C0642b;
import java.io.Serializable;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.github.catvod.spider.merge.W.t */
/* loaded from: classes.dex */
public final class C0267t implements Serializable {

    /* renamed from: g */
    static final Locale f469g;

    /* renamed from: h */
    private static final Comparator<String> f470h;

    /* renamed from: i */
    private static final ConcurrentMap<Locale, AbstractC0262o>[] f471i;

    /* renamed from: j */
    private static final C0252e f472j;

    /* renamed from: k */
    private static final C0253f f473k;

    /* renamed from: l */
    private static final C0260m f474l;

    /* renamed from: m */
    private static final C0260m f475m;

    /* renamed from: n */
    private static final C0260m f476n;

    /* renamed from: o */
    private static final C0260m f477o;

    /* renamed from: p */
    private static final C0260m f478p;

    /* renamed from: q */
    private static final C0254g f479q;

    /* renamed from: r */
    private static final C0260m f480r;

    /* renamed from: s */
    private static final C0260m f481s;

    /* renamed from: t */
    private static final C0255h f482t;

    /* renamed from: u */
    private static final C0256i f483u;

    /* renamed from: v */
    private static final C0260m f484v;

    /* renamed from: w */
    private static final C0260m f485w;

    /* renamed from: x */
    private static final C0260m f486x;

    /* renamed from: y */
    private static final C0260m f487y;

    /* renamed from: a */
    private final String f488a;

    /* renamed from: b */
    private final TimeZone f489b;

    /* renamed from: c */
    private final Locale f490c;

    /* renamed from: d */
    private final int f491d;

    /* renamed from: e */
    private final int f492e;

    /* renamed from: f */
    private transient List<C0263p> f493f;

    static {
        Comparator<String> reverseOrder;
        String m897d = atm.m897d("001B");
        String m897d2 = atm.m897d("202A");
        f469g = new Locale(m897d, m897d2, m897d2);
        reverseOrder = Comparator.reverseOrder();
        f470h = reverseOrder;
        f471i = new ConcurrentMap[17];
        f472j = new C0252e();
        f473k = new C0253f();
        f474l = new C0260m(1);
        f475m = new C0260m(3);
        f476n = new C0260m(4);
        f477o = new C0260m(6);
        f478p = new C0260m(5);
        f479q = new C0254g();
        f480r = new C0260m(8);
        f481s = new C0260m(11);
        f482t = new C0255h();
        f483u = new C0256i();
        f484v = new C0260m(10);
        f485w = new C0260m(12);
        f486x = new C0260m(13);
        f487y = new C0260m(14);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List<com.github.catvod.spider.merge.W.p>, java.util.ArrayList] */
    public C0267t(String str, TimeZone timeZone, Locale locale) {
        int i;
        this.f488a = str;
        this.f489b = timeZone;
        Locale m1177a = C0202c.m1177a(locale);
        this.f490c = m1177a;
        Calendar calendar = Calendar.getInstance(timeZone, m1177a);
        if (m1177a.equals(f469g)) {
            i = 0;
        } else {
            calendar.setTime(new Date());
            i = calendar.get(1) - 80;
        }
        int i2 = (i / 100) * 100;
        this.f491d = i2;
        this.f492e = i - i2;
        this.f493f = new ArrayList();
        C0264q c0264q = new C0264q(this, calendar);
        while (true) {
            C0263p m1088a = c0264q.m1088a();
            if (m1088a == null) {
                return;
            }
            this.f493f.add(m1088a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static AbstractC0262o m1085b(C0267t c0267t, char c, int i, Calendar calendar) {
        int i2;
        c0267t.getClass();
        if (c != 'y') {
            if (c != 'z') {
                switch (c) {
                    case 'D':
                        return f477o;
                    case 'E':
                        i2 = 7;
                        break;
                    case 'F':
                        return f480r;
                    case 'G':
                        i2 = 0;
                        break;
                    case 'H':
                        return f481s;
                    default:
                        switch (c) {
                            case 'K':
                                return f484v;
                            case 'M':
                                return i >= 3 ? c0267t.m1080g(2, calendar) : f473k;
                            case 'S':
                                return f487y;
                            case 'a':
                                i2 = 9;
                                break;
                            case 'd':
                                return f478p;
                            case 'h':
                                return f483u;
                            case 'k':
                                return f482t;
                            case 'm':
                                return f485w;
                            case 's':
                                return f486x;
                            case 'u':
                                return f479q;
                            case 'w':
                                return f475m;
                            default:
                                switch (c) {
                                    case 'W':
                                        return f476n;
                                    case 'X':
                                        return C0259l.m1092e(i);
                                    case 'Y':
                                        break;
                                    case 'Z':
                                        if (i == 2) {
                                            return C0259l.m1093d();
                                        }
                                        break;
                                    default:
                                        throw new IllegalArgumentException(atm.m897d("2C1508182D2C4A5D") + c + atm.m897d("4D5A141A3878190F0A05232A1E1F1E"));
                                }
                        }
                }
                return c0267t.m1080g(i2, calendar);
            }
            i2 = 15;
            return c0267t.m1080g(i2, calendar);
        }
        return i > 2 ? f474l : f472j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static Map m1084c(Calendar calendar, Locale locale, int i, StringBuilder sb) {
        HashMap hashMap = new HashMap();
        Locale m1177a = C0202c.m1177a(locale);
        Map<String, Integer> displayNames = calendar.getDisplayNames(i, 0, m1177a);
        TreeSet treeSet = new TreeSet(f470h);
        for (Map.Entry<String, Integer> entry : displayNames.entrySet()) {
            String lowerCase = entry.getKey().toLowerCase(m1177a);
            if (treeSet.add(lowerCase)) {
                hashMap.put(lowerCase, entry.getValue());
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            m1077j(sb, (String) it.next());
            sb.append('|');
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static int m1083d(C0267t c0267t, int i) {
        int i2 = c0267t.f491d + i;
        return i >= c0267t.f492e ? i2 : i2 + 100;
    }

    /*  JADX ERROR: NullPointerException in pass: MarkMethodsForInline
        java.lang.NullPointerException
        */
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static /* synthetic */ java.lang.StringBuilder m1081f(java.lang.StringBuilder r0, java.lang.String r1) {
        /*
            m1077j(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p021W.C0267t.m1081f(java.lang.StringBuilder, java.lang.String):java.lang.StringBuilder");
    }

    /* renamed from: g */
    private AbstractC0262o m1080g(int i, Calendar calendar) {
        ConcurrentMap<Locale, AbstractC0262o> concurrentMap;
        ConcurrentMap<Locale, AbstractC0262o>[] concurrentMapArr = f471i;
        synchronized (concurrentMapArr) {
            if (concurrentMapArr[i] == null) {
                concurrentMapArr[i] = new ConcurrentHashMap(3);
            }
            concurrentMap = concurrentMapArr[i];
        }
        AbstractC0262o abstractC0262o = concurrentMap.get(this.f490c);
        if (abstractC0262o == null) {
            abstractC0262o = i == 15 ? new C0266s(this.f490c) : new C0257j(i, calendar, this.f490c);
            AbstractC0262o putIfAbsent = concurrentMap.putIfAbsent(this.f490c, abstractC0262o);
            if (putIfAbsent != null) {
                return putIfAbsent;
            }
        }
        return abstractC0262o;
    }

    /* renamed from: j */
    private static StringBuilder m1077j(StringBuilder sb, String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt != '$' && charAt != '.' && charAt != '?' && charAt != '^' && charAt != '[' && charAt != '\\' && charAt != '{' && charAt != '|') {
                switch (charAt) {
                    case '(':
                    case ')':
                    case '*':
                    case '+':
                        break;
                    default:
                        sb.append(charAt);
                }
            }
            sb.append('\\');
            sb.append(charAt);
        }
        if (sb.charAt(sb.length() - 1) == '.') {
            sb.append('?');
        }
        return sb;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0267t) {
            C0267t c0267t = (C0267t) obj;
            return this.f488a.equals(c0267t.f488a) && this.f489b.equals(c0267t.f489b) && this.f490c.equals(c0267t.f490c);
        }
        return false;
    }

    /* renamed from: h */
    public final Date m1079h(String str) {
        ParsePosition parsePosition = new ParsePosition(0);
        Date m1078i = m1078i(str, parsePosition);
        if (m1078i == null) {
            if (this.f490c.equals(f469g)) {
                StringBuilder m635a = C0424a.m635a(atm.m897d("422E12106C"));
                m635a.append(this.f490c);
                m635a.append(atm.m897d("4A1615162D340F5A1E1A292B4A1415016C2B1F0A0A1A3E2C4A1E1B01292B4A181F13232A0F5A4B4D7A604A3B3E5C460D040A1B073F3D0B1816106C3C0B0E1F4F6C7A"));
                m635a.append(str);
                throw new ParseException(m635a.toString(), parsePosition.getErrorIndex());
            }
            throw new ParseException(C0642b.m156a(atm.m897d("3F140A143E2B0F1B181929780E1B0E107678"), str), parsePosition.getErrorIndex());
        }
        return m1078i;
    }

    public final int hashCode() {
        return (((this.f490c.hashCode() * 13) + this.f489b.hashCode()) * 13) + this.f488a.hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0051 A[EDGE_INSN: B:23:0x0051->B:18:0x0051 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List<com.github.catvod.spider.merge.W.p>, java.util.ArrayList] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Date m1078i(java.lang.String r10, java.text.ParsePosition r11) {
        /*
            r9 = this;
            java.util.TimeZone r0 = r9.f489b
            java.util.Locale r1 = r9.f490c
            java.util.Calendar r0 = java.util.Calendar.getInstance(r0, r1)
            r0.clear()
            java.util.List<com.github.catvod.spider.merge.W.p> r1 = r9.f493f
            java.util.ListIterator r1 = r1.listIterator()
        L11:
            boolean r2 = r1.hasNext()
            r8 = 0
            if (r2 == 0) goto L50
            java.lang.Object r2 = r1.next()
            com.github.catvod.spider.merge.W.p r2 = (com.github.catvod.spider.merge.p021W.C0263p) r2
            com.github.catvod.spider.merge.W.o r3 = r2.f460a
            boolean r3 = r3.mo1090a()
            if (r3 == 0) goto L42
            boolean r3 = r1.hasNext()
            if (r3 != 0) goto L2d
            goto L42
        L2d:
            java.lang.Object r3 = r1.next()
            com.github.catvod.spider.merge.W.p r3 = (com.github.catvod.spider.merge.p021W.C0263p) r3
            com.github.catvod.spider.merge.W.o r3 = r3.f460a
            r1.previous()
            boolean r3 = r3.mo1090a()
            if (r3 == 0) goto L42
            int r3 = r2.f461b
            r7 = r3
            goto L43
        L42:
            r7 = 0
        L43:
            com.github.catvod.spider.merge.W.o r2 = r2.f460a
            r3 = r9
            r4 = r0
            r5 = r10
            r6 = r11
            boolean r2 = r2.mo1089b(r3, r4, r5, r6, r7)
            if (r2 != 0) goto L11
            goto L51
        L50:
            r8 = 1
        L51:
            if (r8 == 0) goto L58
            java.util.Date r10 = r0.getTime()
            goto L59
        L58:
            r10 = 0
        L59:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p021W.C0267t.m1078i(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    public final String toString() {
        StringBuilder m635a = C0424a.m635a(atm.m897d("2C1B090108391E1F2A143E2B0F0821"));
        m635a.append(this.f488a);
        String m897d = atm.m897d("465A");
        m635a.append(m897d);
        m635a.append(this.f490c);
        m635a.append(m897d);
        m635a.append(this.f489b.getID());
        m635a.append(atm.m897d("37"));
        return m635a.toString();
    }
}
