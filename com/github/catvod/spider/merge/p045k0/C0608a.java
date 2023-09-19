package com.github.catvod.spider.merge.p045k0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p001B.C0006a;
import com.github.catvod.spider.merge.p035f0.InterfaceC0520a;
import com.github.catvod.spider.merge.p035f0.InterfaceC0522c;
import com.github.catvod.spider.merge.p035f0.InterfaceC0523d;
import com.github.catvod.spider.merge.p037g0.C0529a;
import com.github.catvod.spider.merge.p037g0.C0530b;
import com.github.catvod.spider.merge.p037g0.C0531c;
import com.github.catvod.spider.merge.p037g0.C0532d;
import com.github.catvod.spider.merge.p037g0.C0533e;
import com.github.catvod.spider.merge.p037g0.C0534f;
import com.github.catvod.spider.merge.p037g0.C0535g;
import com.github.catvod.spider.merge.p037g0.C0536h;
import com.github.catvod.spider.merge.p037g0.C0537i;
import com.github.catvod.spider.merge.p037g0.C0538j;
import com.github.catvod.spider.merge.p037g0.C0539k;
import com.github.catvod.spider.merge.p037g0.C0540l;
import com.github.catvod.spider.merge.p037g0.C0541m;
import com.github.catvod.spider.merge.p037g0.C0542n;
import com.github.catvod.spider.merge.p039h0.C0544a;
import com.github.catvod.spider.merge.p039h0.C0545b;
import com.github.catvod.spider.merge.p039h0.C0546c;
import com.github.catvod.spider.merge.p039h0.C0547d;
import com.github.catvod.spider.merge.p039h0.C0548e;
import com.github.catvod.spider.merge.p039h0.C0549f;
import com.github.catvod.spider.merge.p039h0.C0550g;
import com.github.catvod.spider.merge.p039h0.C0551h;
import com.github.catvod.spider.merge.p039h0.C0552i;
import com.github.catvod.spider.merge.p039h0.C0553j;
import com.github.catvod.spider.merge.p039h0.C0554k;
import com.github.catvod.spider.merge.p039h0.C0555l;
import com.github.catvod.spider.merge.p039h0.C0556m;
import com.github.catvod.spider.merge.p039h0.C0557n;
import com.github.catvod.spider.merge.p039h0.C0558o;
import com.github.catvod.spider.merge.p039h0.C0559p;
import com.github.catvod.spider.merge.p039h0.C0561r;
import com.github.catvod.spider.merge.p041i0.C0566a;
import com.github.catvod.spider.merge.p041i0.C0567b;
import com.github.catvod.spider.merge.p041i0.C0568c;
import com.github.catvod.spider.merge.p041i0.C0569d;
import com.github.catvod.spider.merge.p041i0.C0570e;
import com.github.catvod.spider.merge.p041i0.C0572g;
import com.github.catvod.spider.merge.p043j0.C0581b;
import com.github.catvod.spider.merge.p043j0.C0582c;
import com.github.catvod.spider.merge.p047l0.C0616c;
import com.github.catvod.spider.merge.p047l0.InterfaceC0615b;
import com.github.catvod.spider.merge.p054p.C0642b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.github.catvod.spider.merge.k0.a */
/* loaded from: classes.dex */
public final class C0608a {

    /* renamed from: a */
    private static Map<String, InterfaceC0520a> f1161a = new HashMap();

    /* renamed from: b */
    private static Map<String, InterfaceC0523d> f1162b = new HashMap();

    /* renamed from: c */
    private static Map<String, InterfaceC0522c> f1163c = new HashMap();

    /* renamed from: d */
    private static InterfaceC0615b f1164d = C0616c.m216d(C0608a.class);

    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.Map<java.lang.String, com.github.catvod.spider.merge.f0.c>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.Map<java.lang.String, com.github.catvod.spider.merge.f0.a>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Map<java.lang.String, com.github.catvod.spider.merge.f0.d>, java.util.HashMap] */
    static {
        Class[] clsArr = {C0529a.class, C0530b.class, C0531c.class, C0532d.class, C0533e.class, C0534f.class, C0535g.class, C0536h.class, C0537i.class, C0538j.class, C0539k.class, C0540l.class, C0541m.class, C0542n.class};
        int i = 0;
        for (int i2 = 14; i < i2; i2 = 14) {
            try {
                InterfaceC0520a interfaceC0520a = (InterfaceC0520a) clsArr[i].newInstance();
                f1161a.put(interfaceC0520a.name(), interfaceC0520a);
            } catch (Exception e) {
                f1164d.mo174a(C0006a.m1502b(e), e);
            }
            i++;
        }
        Class[] clsArr2 = {C0544a.class, C0545b.class, C0546c.class, C0547d.class, C0549f.class, C0550g.class, C0551h.class, C0552i.class, C0553j.class, C0554k.class, C0555l.class, C0557n.class, C0559p.class, C0548e.class, C0556m.class, C0558o.class, C0561r.class};
        for (int i3 = 0; i3 < 17; i3++) {
            try {
                InterfaceC0522c interfaceC0522c = (InterfaceC0522c) clsArr2[i3].newInstance();
                f1163c.put(interfaceC0522c.name(), interfaceC0522c);
            } catch (Exception e2) {
                f1164d.mo174a(C0006a.m1502b(e2), e2);
            }
        }
        Class[] clsArr3 = {C0566a.class, C0567b.class, C0568c.class, C0569d.class, C0570e.class, C0572g.class};
        for (int i4 = 0; i4 < 6; i4++) {
            try {
                InterfaceC0523d interfaceC0523d = (InterfaceC0523d) clsArr3[i4].newInstance();
                f1162b.put(interfaceC0523d.name(), interfaceC0523d);
            } catch (Exception e3) {
                f1164d.mo174a(C0006a.m1502b(e3), e3);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<java.lang.String, com.github.catvod.spider.merge.f0.c>, java.util.HashMap] */
    /* renamed from: a */
    public static InterfaceC0522c m243a(String str) {
        InterfaceC0522c interfaceC0522c = (InterfaceC0522c) f1163c.get(str);
        if (interfaceC0522c != null) {
            return interfaceC0522c;
        }
        throw new C0582c(C0642b.m156a(atm.m897d("04150E553F2D1A0A150738780C0F1416383105144055"), str));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<java.lang.String, com.github.catvod.spider.merge.f0.d>, java.util.HashMap] */
    /* renamed from: b */
    public static InterfaceC0523d m242b(String str) {
        InterfaceC0523d interfaceC0523d = (InterfaceC0523d) f1162b.get(str);
        if (interfaceC0523d != null) {
            return interfaceC0523d;
        }
        throw new C0582c(C0642b.m156a(atm.m897d("04150E553F2D1A0A1507387804151E10183D190E4055"), str));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<java.lang.String, com.github.catvod.spider.merge.f0.a>, java.util.HashMap] */
    /* renamed from: c */
    public static InterfaceC0520a m241c(String str) {
        InterfaceC0520a interfaceC0520a = (InterfaceC0520a) f1161a.get(str);
        if (interfaceC0520a != null) {
            return interfaceC0520a;
        }
        throw new C0581b(C0642b.m156a(atm.m897d("04150E553F2D1A0A150738780B0213067678"), str));
    }
}
