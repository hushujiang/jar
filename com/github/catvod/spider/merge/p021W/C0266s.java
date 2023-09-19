package com.github.catvod.spider.merge.p021W;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p028c.C0424a;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.W.s */
/* loaded from: classes.dex */
public final class C0266s extends AbstractC0261n {

    /* renamed from: b */
    private final Locale f467b;

    /* renamed from: c */
    private final Map<String, C0265r> f468c;

    /*  JADX ERROR: JadxRuntimeException in pass: InlineMethods
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to process method for inline: com.github.catvod.spider.merge.W.t.f(java.lang.StringBuilder, java.lang.String):java.lang.StringBuilder
        	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:76)
        	at jadx.core.dex.visitors.InlineMethods.visit(InlineMethods.java:51)
        Caused by: java.lang.NullPointerException
        */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.W.r>] */
    C0266s(java.util.Locale r15) {
        /*
            r14 = this;
            r14.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r14.f468c = r0
            java.util.Locale r0 = com.github.catvod.spider.merge.p018S.C0202c.m1177a(r15)
            r14.f467b = r0
            java.lang.String r0 = "4252451C397131515728103C114E07090B153E21515811040E014B597E2550261E0E7E25"
            java.lang.String r0 = com.github.catvod.spider.merge.atm.m897d(r0)
            java.lang.StringBuilder r0 = com.github.catvod.spider.merge.p028c.C0424a.m635a(r0)
            java.util.TreeSet r1 = new java.util.TreeSet
            java.util.Comparator r2 = com.github.catvod.spider.merge.p021W.C0267t.m1082e()
            r1.<init>(r2)
            java.text.DateFormatSymbols r2 = java.text.DateFormatSymbols.getInstance(r15)
            java.lang.String[][] r2 = r2.getZoneStrings()
            int r3 = r2.length
            r4 = 0
            r5 = 0
        L2e:
            if (r5 >= r3) goto L79
            r6 = r2[r5]
            r7 = r6[r4]
            java.lang.String r8 = "2D372E"
            java.lang.String r8 = com.github.catvod.spider.merge.atm.m897d(r8)
            boolean r8 = r7.equalsIgnoreCase(r8)
            if (r8 == 0) goto L41
            goto L76
        L41:
            java.util.TimeZone r7 = java.util.TimeZone.getTimeZone(r7)
            com.github.catvod.spider.merge.W.r r8 = new com.github.catvod.spider.merge.W.r
            r8.<init>(r7, r4)
            r9 = 1
            r10 = 1
            r11 = r8
        L4d:
            int r12 = r6.length
            if (r10 >= r12) goto L76
            r12 = 3
            if (r10 == r12) goto L59
            r12 = 5
            if (r10 == r12) goto L57
            goto L5e
        L57:
            r11 = r8
            goto L5e
        L59:
            com.github.catvod.spider.merge.W.r r11 = new com.github.catvod.spider.merge.W.r
            r11.<init>(r7, r9)
        L5e:
            r12 = r6[r10]
            if (r12 == 0) goto L73
            r12 = r6[r10]
            java.lang.String r12 = r12.toLowerCase(r15)
            boolean r13 = r1.add(r12)
            if (r13 == 0) goto L73
            java.util.Map<java.lang.String, com.github.catvod.spider.merge.W.r> r13 = r14.f468c
            r13.put(r12, r11)
        L73:
            int r10 = r10 + 1
            goto L4d
        L76:
            int r5 = r5 + 1
            goto L2e
        L79:
            java.util.Iterator r15 = r1.iterator()
        L7d:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L92
            java.lang.Object r1 = r15.next()
            java.lang.String r1 = (java.lang.String) r1
            r2 = 124(0x7c, float:1.74E-43)
            r0.append(r2)
            com.github.catvod.spider.merge.p021W.C0267t.m1081f(r0, r1)
            goto L7d
        L92:
            java.lang.String r15 = "43"
            java.lang.String r15 = com.github.catvod.spider.merge.atm.m897d(r15)
            r0.append(r15)
            java.lang.String r15 = r0.toString()
            java.util.regex.Pattern r15 = java.util.regex.Pattern.compile(r15)
            r14.f459a = r15
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p021W.C0266s.<init>(java.util.Locale):void");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.W.r>] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.W.r>] */
    @Override // com.github.catvod.spider.merge.p021W.AbstractC0261n
    /* renamed from: c */
    final void mo1087c(Calendar calendar, String str) {
        TimeZone m1099a = C0245O.m1099a(str);
        if (m1099a != null) {
            calendar.setTimeZone(m1099a);
            return;
        }
        String lowerCase = str.toLowerCase(this.f467b);
        C0265r c0265r = (C0265r) this.f468c.get(lowerCase);
        if (c0265r == null) {
            ?? r0 = this.f468c;
            c0265r = (C0265r) r0.get(lowerCase + '.');
        }
        calendar.set(16, c0265r.f466b);
        calendar.set(15, c0265r.f465a.getRawOffset());
    }

    @Override // com.github.catvod.spider.merge.p021W.AbstractC0261n
    public final String toString() {
        StringBuilder m635a = C0424a.m635a(atm.m897d("3E1317101637041F29013E391E1F1D0C6C0306151914203D57"));
        m635a.append(this.f467b);
        m635a.append(atm.m897d("465A0E0F0239071F0948"));
        m635a.append(this.f468c);
        m635a.append(atm.m897d("465A0A14382C0F081448"));
        m635a.append(this.f459a);
        m635a.append(atm.m897d("37"));
        return m635a.toString();
    }
}
