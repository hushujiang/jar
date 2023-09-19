package com.github.catvod.spider.merge.p015P;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p013N.C0074I;
import com.github.catvod.spider.merge.p013N.InterfaceC0073H;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: com.github.catvod.spider.merge.P.c */
/* loaded from: classes.dex */
public final class C0176c {

    /* renamed from: a */
    private final C0175b f311a;

    /* renamed from: b */
    private final InterfaceC0073H f312b;

    public C0176c(C0175b c0175b, InterfaceC0073H interfaceC0073H) {
        this.f311a = c0175b;
        this.f312b = interfaceC0073H;
    }

    /* renamed from: a */
    protected final String m1223a(C0178e c0178e) {
        StringBuilder sb;
        int i = c0178e.f315a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c0178e.f318d ? atm.m897d("50") : "");
        sb2.append(atm.m897d("19"));
        sb2.append(i);
        sb2.append(c0178e.f321g ? atm.m897d("34") : "");
        String sb3 = sb2.toString();
        if (c0178e.f318d) {
            C0177d[] c0177dArr = c0178e.f322h;
            String m897d = atm.m897d("5744");
            if (c0177dArr != null) {
                sb = new StringBuilder();
                sb.append(sb3);
                sb.append(m897d);
                sb.append(Arrays.toString(c0178e.f322h));
            } else {
                sb = new StringBuilder();
                sb.append(sb3);
                sb.append(m897d);
                sb.append(c0178e.f319e);
            }
            return sb.toString();
        }
        return sb3;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.P.e, com.github.catvod.spider.merge.P.e>] */
    public final String toString() {
        if (this.f311a.f307b == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        C0175b c0175b = this.f311a;
        c0175b.getClass();
        ArrayList arrayList = new ArrayList(c0175b.f306a.keySet());
        Collections.sort(arrayList, new C0174a());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0178e c0178e = (C0178e) it.next();
            C0178e[] c0178eArr = c0178e.f317c;
            int length = c0178eArr != null ? c0178eArr.length : 0;
            for (int i = 0; i < length; i++) {
                C0178e c0178e2 = c0178e.f317c[i];
                if (c0178e2 != null && c0178e2.f315a != Integer.MAX_VALUE) {
                    sb.append(m1223a(c0178e));
                    String m1388a = ((C0074I) this.f312b).m1388a(i - 1);
                    sb.append(atm.m897d("47"));
                    sb.append(m1388a);
                    sb.append(atm.m897d("4744"));
                    sb.append(m1223a(c0178e2));
                    sb.append('\n');
                }
            }
        }
        String sb2 = sb.toString();
        if (sb2.length() == 0) {
            return null;
        }
        return sb2;
    }
}
