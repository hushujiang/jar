package com.github.catvod.spider.merge.p013N;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p014O.AbstractC0151m;
import com.github.catvod.spider.merge.p014O.C0119S;
import com.github.catvod.spider.merge.p014O.C0127a;
import com.github.catvod.spider.merge.p014O.C0138f0;
import com.github.catvod.spider.merge.p016Q.C0189k;
import com.github.catvod.spider.merge.p016Q.C0191m;
import com.github.catvod.spider.merge.p028c.C0424a;
import com.github.catvod.spider.merge.p033e0.C0490D;
import java.io.PrintStream;

/* renamed from: com.github.catvod.spider.merge.N.o */
/* loaded from: classes.dex */
public class C0090o {

    /* renamed from: a */
    protected boolean f147a = false;

    /* renamed from: b */
    protected int f148b = -1;

    /* renamed from: c */
    protected C0189k f149c;

    /* renamed from: d */
    protected C0099x f150d;

    /* renamed from: e */
    protected int f151e;

    /* renamed from: a */
    protected final void m1356a(AbstractC0098w abstractC0098w, C0189k c0189k) {
        InterfaceC0072G interfaceC0072G = abstractC0098w.f167e;
        while (true) {
            int mo1343h = interfaceC0072G.mo1343h(1);
            if (mo1343h == -1 || c0189k.m1201d(mo1343h)) {
                return;
            }
            abstractC0098w.m1333j();
            interfaceC0072G = abstractC0098w.f167e;
        }
    }

    /* renamed from: b */
    protected final String m1355b(String str) {
        String replace = str.replace(atm.m897d("60"), atm.m897d("3614")).replace(atm.m897d("67"), atm.m897d("3608")).replace(atm.m897d("63"), atm.m897d("360E"));
        StringBuilder sb = new StringBuilder();
        String m897d = atm.m897d("4D");
        sb.append(m897d);
        sb.append(replace);
        sb.append(m897d);
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List<com.github.catvod.spider.merge.O.m>, java.util.ArrayList] */
    /* renamed from: c */
    protected final C0189k m1354c(AbstractC0098w abstractC0098w) {
        C0127a c0127a = ((C0119S) abstractC0098w.f108b).f278a;
        C0189k c0189k = new C0189k(new int[0]);
        for (C0068C c0068c = abstractC0098w.f169g; c0068c != null; c0068c = c0068c.f111a) {
            int i = c0068c.f112b;
            if (i < 0) {
                break;
            }
            c0189k.m1202c(c0127a.m1268e(((C0138f0) ((AbstractC0151m) c0127a.f234a.get(i)).m1243d(0)).f263c));
        }
        c0189k.m1197h();
        return c0189k;
    }

    /* renamed from: d */
    protected final C0189k m1353d(AbstractC0098w abstractC0098w) {
        abstractC0098w.getClass();
        return C0490D.f925q.m1270c(abstractC0098w.m1391g(), abstractC0098w.f169g);
    }

    /* renamed from: e */
    protected final String m1352e(InterfaceC0069D interfaceC0069D) {
        if (interfaceC0069D == null) {
            return atm.m897d("561415553837011F144B");
        }
        String text = interfaceC0069D.getText();
        if (text == null) {
            if (interfaceC0069D.getType() == -1) {
                text = atm.m897d("563F353372");
            } else {
                StringBuilder m635a = C0424a.m635a(atm.m897d("56"));
                m635a.append(interfaceC0069D.getType());
                m635a.append(atm.m897d("54"));
                text = m635a.toString();
            }
        }
        return m1355b(text);
    }

    /* renamed from: f */
    public void mo299f(AbstractC0098w abstractC0098w, C0101z c0101z) {
        C0189k c0189k;
        if (this.f148b == abstractC0098w.f167e.mo1342i() && (c0189k = this.f149c) != null && c0189k.m1201d(abstractC0098w.m1391g())) {
            abstractC0098w.m1333j();
        }
        this.f148b = abstractC0098w.f167e.mo1342i();
        if (this.f149c == null) {
            this.f149c = new C0189k(new int[0]);
        }
        this.f149c.m1204a(abstractC0098w.m1391g());
        m1356a(abstractC0098w, m1354c(abstractC0098w));
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List<com.github.catvod.spider.merge.O.m>, java.util.ArrayList] */
    /* renamed from: g */
    public InterfaceC0069D mo298g(AbstractC0098w abstractC0098w) {
        String sb;
        InterfaceC0069D m1348k = m1348k(abstractC0098w);
        if (m1348k != null) {
            abstractC0098w.m1333j();
            return m1348k;
        }
        boolean z = true;
        if (!((C0119S) abstractC0098w.f108b).f278a.m1267f(((AbstractC0151m) ((C0119S) abstractC0098w.f108b).f278a.f234a.get(abstractC0098w.m1391g())).m1243d(0).f298a, abstractC0098w.f169g).m1201d(abstractC0098w.f167e.mo1343h(1))) {
            z = false;
        } else if (!this.f147a) {
            this.f147a = true;
            InterfaceC0069D m1328o = abstractC0098w.m1328o();
            C0189k m1353d = m1353d(abstractC0098w);
            StringBuilder m635a = C0424a.m635a(atm.m897d("0713090625360D5A"));
            m635a.append(m1353d.m1193l(C0490D.f923o));
            m635a.append(atm.m897d("4A1B0E55"));
            m635a.append(m1352e(m1328o));
            abstractC0098w.m1325r(m1328o, m635a.toString(), null);
        }
        if (z) {
            InterfaceC0069D m1328o2 = abstractC0098w.m1328o();
            C0189k m1353d2 = m1353d(abstractC0098w);
            int m1200e = !m1353d2.m1199f() ? m1353d2.m1200e() : 0;
            if (m1200e == -1) {
                sb = atm.m897d("561713063F31041D5A30031E54");
            } else {
                StringBuilder m635a2 = C0424a.m635a(atm.m897d("561713063F31041D5A"));
                m635a2.append(C0490D.f923o.m1388a(m1200e));
                m635a2.append(atm.m897d("54"));
                sb = m635a2.toString();
            }
            String str = sb;
            InterfaceC0069D mo1359g = abstractC0098w.f167e.mo1359g(-1);
            if (m1328o2.getType() == -1 && mo1359g != null) {
                m1328o2 = mo1359g;
            }
            return ((C0087l) abstractC0098w.f167e.mo1385b().mo1338c()).m1360a(new C0191m(m1328o2.mo1363b(), m1328o2.mo1363b().mo1339b()), m1200e, str, 0, -1, -1, m1328o2.getLine(), m1328o2.mo1364a());
        } else if (this.f150d == null) {
            throw new C0092q(abstractC0098w);
        } else {
            throw new C0092q(abstractC0098w, this.f151e, this.f150d);
        }
    }

    /* renamed from: h */
    public final void m1351h(AbstractC0098w abstractC0098w, C0101z c0101z) {
        String m897d;
        if (this.f147a) {
            return;
        }
        this.f147a = true;
        if (c0101z instanceof C0096u) {
            C0096u c0096u = (C0096u) c0101z;
            InterfaceC0072G interfaceC0072G = abstractC0098w.f167e;
            if (interfaceC0072G != null) {
                m897d = c0096u.m1335f().getType() == -1 ? atm.m897d("563F353372") : interfaceC0072G.mo1384d(c0096u.m1335f(), c0096u.m1312c());
            } else {
                m897d = atm.m897d("560F141E22371D145A1C22281F0E44");
            }
            StringBuilder m635a = C0424a.m635a(atm.m897d("04155A03253908161F552D341E1F081B2D2C030C1F552D2C4A131405392C4A"));
            m635a.append(m1355b(m897d));
            abstractC0098w.m1325r(c0096u.m1312c(), m635a.toString(), c0096u);
        } else if (c0101z instanceof C0092q) {
            C0101z c0101z2 = (C0092q) c0101z;
            StringBuilder m635a2 = C0424a.m635a(atm.m897d("071309182D2C09121F116C31040A0F016C"));
            m635a2.append(m1352e(c0101z2.m1312c()));
            m635a2.append(atm.m897d("4A1F0205293B1E1314126C"));
            C0189k m1314a = c0101z2.m1314a();
            ((C0490D) abstractC0098w).getClass();
            m635a2.append(m1314a.m1193l(C0490D.f923o));
            abstractC0098w.m1325r(c0101z2.m1312c(), m635a2.toString(), c0101z2);
        } else if (c0101z instanceof C0091p) {
            C0101z c0101z3 = (C0091p) c0101z;
            ((C0490D) abstractC0098w).getClass();
            String str = C0490D.f922n[abstractC0098w.f169g.mo475e()];
            abstractC0098w.m1325r(c0101z3.m1312c(), atm.m897d("180F16106C") + str + atm.m897d("4A") + c0101z3.getMessage(), c0101z3);
        } else {
            PrintStream printStream = System.err;
            StringBuilder m635a3 = C0424a.m635a(atm.m897d("1F14111B232F045A08102F370D1413012537045A1F073E37185A0E0C3C3D505A"));
            m635a3.append(c0101z.getClass().getName());
            printStream.println(m635a3.toString());
            abstractC0098w.m1325r(c0101z.m1312c(), c0101z.getMessage(), c0101z);
        }
    }

    /* renamed from: i */
    public final void m1350i() {
        this.f147a = false;
        this.f149c = null;
        this.f148b = -1;
    }

    /* renamed from: j */
    protected final void m1349j(AbstractC0098w abstractC0098w) {
        if (this.f147a) {
            return;
        }
        this.f147a = true;
        InterfaceC0069D m1328o = abstractC0098w.m1328o();
        String m1352e = m1352e(m1328o);
        C0189k m1353d = m1353d(abstractC0098w);
        abstractC0098w.m1325r(m1328o, atm.m897d("0F020E072D360F150F066C31040A0F016C") + m1352e + atm.m897d("4A1F0205293B1E1314126C") + m1353d.m1193l(C0490D.f923o), null);
    }

    /* renamed from: k */
    protected final InterfaceC0069D m1348k(AbstractC0098w abstractC0098w) {
        if (m1353d(abstractC0098w).m1201d(abstractC0098w.f167e.mo1343h(2))) {
            m1349j(abstractC0098w);
            abstractC0098w.m1333j();
            InterfaceC0069D m1328o = abstractC0098w.m1328o();
            m1350i();
            return m1328o;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List<com.github.catvod.spider.merge.O.m>, java.util.ArrayList] */
    /* renamed from: l */
    public final void m1347l(AbstractC0098w abstractC0098w) {
        AbstractC0151m abstractC0151m = (AbstractC0151m) ((C0119S) abstractC0098w.f108b).f278a.f234a.get(abstractC0098w.m1391g());
        if (this.f147a) {
            return;
        }
        int mo1343h = abstractC0098w.f167e.mo1343h(1);
        C0127a c0127a = C0490D.f925q;
        C0189k m1268e = c0127a.m1268e(abstractC0151m);
        if (m1268e.m1201d(mo1343h)) {
            this.f150d = null;
            this.f151e = -1;
        } else if (m1268e.m1201d(-2)) {
            if (this.f150d == null) {
                this.f150d = abstractC0098w.f169g;
                this.f151e = abstractC0098w.m1391g();
            }
        } else {
            int mo1241c = abstractC0151m.mo1241c();
            if (mo1241c != 3 && mo1241c != 4 && mo1241c != 5) {
                switch (mo1241c) {
                    case 9:
                    case 11:
                        m1349j(abstractC0098w);
                        C0189k m1270c = c0127a.m1270c(abstractC0098w.m1391g(), abstractC0098w.f169g);
                        C0189k m1354c = m1354c(abstractC0098w);
                        C0189k c0189k = new C0189k(new int[0]);
                        c0189k.m1202c(m1270c);
                        c0189k.m1202c(m1354c);
                        m1356a(abstractC0098w, c0189k);
                        return;
                    case 10:
                        break;
                    default:
                        return;
                }
            }
            if (m1348k(abstractC0098w) == null) {
                throw new C0092q(abstractC0098w);
            }
        }
    }
}
