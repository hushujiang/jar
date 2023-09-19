package com.github.catvod.spider.merge.p035f0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p013N.InterfaceC0069D;
import com.github.catvod.spider.merge.p016Q.AbstractC0179a;
import com.github.catvod.spider.merge.p017R.InterfaceC0194b;
import com.github.catvod.spider.merge.p018S.C0207h;
import com.github.catvod.spider.merge.p023Y.C0277c;
import com.github.catvod.spider.merge.p025a0.C0293m;
import com.github.catvod.spider.merge.p028c.C0424a;
import com.github.catvod.spider.merge.p029c0.C0441O;
import com.github.catvod.spider.merge.p029c0.C0455c;
import com.github.catvod.spider.merge.p029c0.C0459g;
import com.github.catvod.spider.merge.p029c0.C0471s;
import com.github.catvod.spider.merge.p033e0.C0487A;
import com.github.catvod.spider.merge.p033e0.C0488B;
import com.github.catvod.spider.merge.p033e0.C0489C;
import com.github.catvod.spider.merge.p033e0.C0494c;
import com.github.catvod.spider.merge.p033e0.C0495d;
import com.github.catvod.spider.merge.p033e0.C0496e;
import com.github.catvod.spider.merge.p033e0.C0497f;
import com.github.catvod.spider.merge.p033e0.C0498g;
import com.github.catvod.spider.merge.p033e0.C0499h;
import com.github.catvod.spider.merge.p033e0.C0500i;
import com.github.catvod.spider.merge.p033e0.C0501j;
import com.github.catvod.spider.merge.p033e0.C0502k;
import com.github.catvod.spider.merge.p033e0.C0503l;
import com.github.catvod.spider.merge.p033e0.C0504m;
import com.github.catvod.spider.merge.p033e0.C0505n;
import com.github.catvod.spider.merge.p033e0.C0506o;
import com.github.catvod.spider.merge.p033e0.C0507p;
import com.github.catvod.spider.merge.p033e0.C0508q;
import com.github.catvod.spider.merge.p033e0.C0509r;
import com.github.catvod.spider.merge.p033e0.C0510s;
import com.github.catvod.spider.merge.p033e0.C0511t;
import com.github.catvod.spider.merge.p033e0.C0512u;
import com.github.catvod.spider.merge.p033e0.C0513v;
import com.github.catvod.spider.merge.p033e0.C0514w;
import com.github.catvod.spider.merge.p033e0.C0515x;
import com.github.catvod.spider.merge.p033e0.C0516y;
import com.github.catvod.spider.merge.p033e0.C0517z;
import com.github.catvod.spider.merge.p033e0.InterfaceC0491E;
import com.github.catvod.spider.merge.p043j0.C0583d;
import com.github.catvod.spider.merge.p043j0.C0584e;
import com.github.catvod.spider.merge.p045k0.C0608a;
import com.github.catvod.spider.merge.p047l0.C0616c;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/* renamed from: com.github.catvod.spider.merge.f0.g */
/* loaded from: classes.dex */
public final class C0526g extends AbstractC0179a implements InterfaceC0491E<C0525f> {

    /* renamed from: a */
    private Stack<C0524e> f950a;

    /* renamed from: b */
    private C0524e f951b;

    public C0526g(C0459g c0459g) {
        C0616c.m216d(C0526g.class);
        this.f950a = new Stack<>();
        this.f951b = C0524e.m460c(c0459g);
        Stack<C0524e> stack = this.f950a;
        C0524e m460c = C0524e.m460c(c0459g);
        m460c.m453j(this.f951b);
        stack.push(m460c);
    }

    /* renamed from: G */
    private C0524e m428G() {
        return this.f950a.peek();
    }

    /* renamed from: H */
    private void m427H(C0459g c0459g) {
        this.f950a.peek().m454i(c0459g);
    }

    @Override // com.github.catvod.spider.merge.p033e0.InterfaceC0491E
    /* renamed from: A */
    public final C0525f mo432A(C0510s c0510s) {
        List m1320k = c0510s.m1320k(C0497f.class);
        if (m1320k.size() > 1) {
            Boolean m451a = ((C0525f) ((InterfaceC0194b) m1320k.get(0)).mo476a(this)).m451a();
            for (int i = 1; i < m1320k.size(); i++) {
                m451a = Boolean.valueOf(m451a.booleanValue() | ((C0525f) ((InterfaceC0194b) m1320k.get(i)).mo476a(this)).m451a().booleanValue());
            }
            return new C0525f(m451a);
        }
        return (C0525f) ((InterfaceC0194b) m1320k.get(0)).mo476a(this);
    }

    @Override // com.github.catvod.spider.merge.p033e0.InterfaceC0491E
    /* renamed from: B */
    public final C0525f mo431B(C0497f c0497f) {
        List m1320k = c0497f.m1320k(C0499h.class);
        if (m1320k.size() > 1) {
            Boolean m451a = ((C0525f) ((InterfaceC0194b) m1320k.get(0)).mo476a(this)).m451a();
            for (int i = 1; i < m1320k.size(); i++) {
                m451a = Boolean.valueOf(m451a.booleanValue() & ((C0525f) ((InterfaceC0194b) m1320k.get(i)).mo476a(this)).m451a().booleanValue());
            }
            return new C0525f(m451a);
        }
        return (C0525f) ((InterfaceC0194b) m1320k.get(0)).mo476a(this);
    }

    @Override // com.github.catvod.spider.merge.p033e0.InterfaceC0491E
    /* renamed from: C */
    public final C0525f mo430C(C0496e c0496e) {
        List m1320k = c0496e.m1320k(C0506o.class);
        if (m1320k.size() == 1) {
            return (C0525f) ((InterfaceC0194b) m1320k.get(0)).mo476a(this);
        }
        Double m449c = ((C0525f) ((InterfaceC0194b) m1320k.get(0)).mo476a(this)).m449c();
        String str = null;
        for (int i = 1; i < c0496e.mo1189d(); i++) {
            InterfaceC0194b mo1190c = c0496e.mo1190c(i);
            if (mo1190c instanceof C0506o) {
                C0525f c0525f = (C0525f) mo1190c.mo476a(this);
                if (atm.m897d("41").equals(str)) {
                    m449c = Double.valueOf(c0525f.m449c().doubleValue() + m449c.doubleValue());
                } else if (!atm.m897d("47").equals(str)) {
                    StringBuilder m635a = C0424a.m635a(atm.m897d("190314012D204A1F0807232A465A"));
                    m635a.append(c0496e.getText());
                    throw new C0584e(m635a.toString());
                } else {
                    m449c = Double.valueOf(m449c.doubleValue() - c0525f.m449c().doubleValue());
                }
            } else {
                str = mo1190c.getText();
            }
        }
        return new C0525f(m449c);
    }

    @Override // com.github.catvod.spider.merge.p033e0.InterfaceC0491E
    /* renamed from: D */
    public final C0525f mo429D(C0517z c0517z) {
        boolean z;
        C0525f c0525f;
        C0459g m448d;
        C0525f c0525f2;
        if (c0517z.m472m() != null && !c0517z.m472m().m1389f()) {
            return (C0525f) c0517z.m472m().mo476a(this);
        }
        boolean z2 = false;
        if (c0517z.m471n() == null || c0517z.m471n().m1389f() || (c0525f2 = (C0525f) c0517z.m471n().mo476a(this)) == null) {
            z = false;
        } else {
            if (c0525f2.m438n()) {
                m427H(c0525f2.m448d());
            } else if (c0525f2.m441k()) {
                z = true;
                z2 = true;
            }
            z = true;
        }
        if (c0517z.m470o() != null && !c0517z.m470o().m1389f()) {
            C0525f c0525f3 = (C0525f) c0517z.m470o().mo476a(this);
            if (z2) {
                C0459g m462a = m428G().m462a();
                String m445g = c0525f3.m445g();
                if (m428G().m457f()) {
                    int size = m462a.size();
                    String m897d = atm.m897d("37");
                    String m897d2 = atm.m897d("31");
                    if (size == 1) {
                        C0293m m452k = m428G().m452k();
                        C0459g m967p0 = m452k.m967p0(m897d2 + m445g + m897d);
                        LinkedList linkedList = new LinkedList();
                        Iterator<C0293m> it = m967p0.iterator();
                        while (it.hasNext()) {
                            linkedList.add(it.next().mo925d(m445g));
                        }
                        return new C0525f(linkedList);
                    }
                    C0459g c0459g = new C0459g();
                    Iterator<C0293m> it2 = m462a.iterator();
                    while (it2.hasNext()) {
                        c0459g.addAll(it2.next().m967p0(m897d2 + m445g + m897d));
                    }
                    LinkedList linkedList2 = new LinkedList();
                    Iterator<C0293m> it3 = c0459g.iterator();
                    while (it3.hasNext()) {
                        linkedList2.add(it3.next().mo925d(m445g));
                    }
                    c0525f = new C0525f(linkedList2);
                } else if (m462a.size() == 1) {
                    c0525f = new C0525f(m428G().m452k().mo925d(m445g));
                } else {
                    LinkedList linkedList3 = new LinkedList();
                    Iterator<C0293m> it4 = m462a.iterator();
                    while (it4.hasNext()) {
                        linkedList3.add(it4.next().mo925d(m445g));
                    }
                    return new C0525f(linkedList3);
                }
                return c0525f;
            }
            if (c0525f3.m437o()) {
                String m445g2 = c0525f3.m445g();
                C0459g m462a2 = m428G().m462a();
                if (m428G().m457f()) {
                    m448d = m462a2.m603d(m445g2);
                } else {
                    C0459g c0459g2 = new C0459g();
                    Iterator<C0293m> it5 = m428G().m462a().iterator();
                    while (it5.hasNext()) {
                        C0293m next = it5.next();
                        String m897d3 = atm.m897d("40");
                        if (!z) {
                            Iterator<C0293m> it6 = next.m986V().iterator();
                            while (it6.hasNext()) {
                                C0293m next2 = it6.next();
                                if (next2.mo900t().equals(m445g2) || m897d3.equals(m445g2)) {
                                    c0459g2.add(next2);
                                }
                            }
                        } else if (next.mo900t().equals(m445g2) || m897d3.equals(m445g2)) {
                            c0459g2.add(next);
                        }
                    }
                    m427H(c0459g2);
                }
            } else if (!c0525f3.m438n()) {
                return c0525f3;
            } else {
                m448d = c0525f3.m448d();
            }
            m427H(m448d);
        }
        if (c0517z.m469p() != null && c0517z.m469p().size() > 0) {
            for (C0512u c0512u : c0517z.m469p()) {
                m427H(((C0525f) c0512u.mo476a(this)).m448d());
            }
        }
        c0525f = new C0525f(m428G().m462a());
        return c0525f;
    }

    @Override // com.github.catvod.spider.merge.p033e0.InterfaceC0491E
    /* renamed from: b */
    public final C0525f mo426b(C0503l c0503l) {
        return (C0525f) ((C0514w) c0503l.m1321j(C0514w.class)).mo476a(this);
    }

    @Override // com.github.catvod.spider.merge.p033e0.InterfaceC0491E
    /* renamed from: c */
    public final C0525f mo425c(C0504m c0504m) {
        return (C0525f) ((c0504m.m483m() == null || c0504m.m483m().m1389f()) ? (C0495d) c0504m.m1321j(C0495d.class) : c0504m.m483m()).mo476a(this);
    }

    @Override // com.github.catvod.spider.merge.p033e0.InterfaceC0491E
    /* renamed from: d */
    public final C0525f mo424d(C0507p c0507p) {
        C0525f c0525f;
        if (c0507p.m1319l(7) != null) {
            c0525f = new C0525f(c0507p.m1319l(7).getText());
        } else {
            c0525f = new C0525f(c0507p.m1319l(41).getText());
        }
        c0525f.m442j();
        return c0525f;
    }

    @Override // com.github.catvod.spider.merge.p033e0.InterfaceC0491E
    /* renamed from: e */
    public final C0525f mo423e(C0516y c0516y) {
        C0525f c0525f = null;
        for (int i = 0; i < c0516y.mo1189d(); i++) {
            InterfaceC0194b mo1190c = c0516y.mo1190c(i);
            if (mo1190c instanceof C0517z) {
                c0525f = (C0525f) mo1190c.mo476a(this);
                if (c0525f.m438n()) {
                    m427H(c0525f.m448d());
                }
            } else {
                if (atm.m897d("4555").equals(mo1190c.getText())) {
                    m428G().m455h();
                } else {
                    m428G().m456g();
                }
            }
        }
        return c0525f;
    }

    @Override // com.github.catvod.spider.merge.p033e0.InterfaceC0491E
    /* renamed from: f */
    public final C0525f mo422f(C0509r c0509r) {
        if (((C0508q) c0509r.m1321j(C0508q.class)) != null) {
            return (C0525f) ((C0508q) c0509r.m1321j(C0508q.class)).mo476a(this);
        }
        if (c0509r.m1319l(5) != null) {
            return C0608a.m242b(c0509r.m1319l(5).getText()).mo313a(m428G());
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.p033e0.InterfaceC0491E
    /* renamed from: g */
    public final C0525f mo421g(C0495d c0495d) {
        Stack<C0524e> stack = this.f950a;
        C0524e m460c = C0524e.m460c(this.f951b.m462a());
        m460c.m453j(m428G());
        stack.push(m460c);
        String text = c0495d.f931g.getText();
        String m897d = atm.m897d("4555");
        if (text == m897d || (text != null && text.equals(m897d))) {
            m428G().m455h();
        }
        C0525f c0525f = (C0525f) ((C0516y) c0495d.m1321j(C0516y.class)).mo476a(this);
        this.f950a.pop();
        return c0525f;
    }

    @Override // com.github.catvod.spider.merge.p033e0.InterfaceC0491E
    /* renamed from: h */
    public final C0525f mo420h(C0494c c0494c) {
        if (atm.m897d("4454").equals(c0494c.getText())) {
            HashSet hashSet = new HashSet();
            C0459g c0459g = new C0459g();
            Iterator<C0293m> it = m428G().m462a().iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().m971l0());
            }
            c0459g.addAll(hashSet);
            return new C0525f(c0459g);
        }
        return new C0525f(m428G().m462a());
    }

    @Override // com.github.catvod.spider.merge.p033e0.InterfaceC0491E
    /* renamed from: i */
    public final C0525f mo419i(C0512u c0512u) {
        String mo925d;
        long j;
        String mo925d2;
        C0459g c0459g = new C0459g();
        Iterator<C0293m> it = m428G().m462a().iterator();
        while (it.hasNext()) {
            C0293m next = it.next();
            Stack<C0524e> stack = this.f950a;
            C0524e m461b = C0524e.m461b(next);
            m461b.m453j(m428G());
            stack.push(m461b);
            C0525f c0525f = (C0525f) ((C0500i) c0512u.m1321j(C0500i.class)).mo476a(this);
            this.f950a.pop();
            if (c0525f.m435q()) {
                long longValue = c0525f.m446f().longValue();
                String m897d = atm.m897d("2022252109003E");
                if (longValue < 0) {
                    String m962u0 = next.m962u0();
                    if (m962u0 == m897d || (m962u0 != null && m962u0.equals(m897d))) {
                        longValue = (C0207h.m1173b(next.mo925d(atm.m897d("2F3625260D152F252E340B072B36362A020D27"))) ? -1 : Integer.parseInt(mo925d2)) + longValue + 1;
                        j = 0;
                    } else {
                        C0524e m428G = m428G();
                        C0459g c0459g2 = new C0459g();
                        C0293m m971l0 = next.m971l0();
                        String m962u02 = next.m962u0();
                        m971l0.getClass();
                        C0277c.m1065j(m962u02);
                        Iterator<C0293m> it2 = C0455c.m609a(new C0471s(C0441O.m623b(m962u02), 1), m971l0).iterator();
                        while (it2.hasNext()) {
                            C0293m next2 = it2.next();
                            if (m428G.m462a().contains(next2)) {
                                c0459g2.add(next2);
                            }
                        }
                        longValue = c0459g2.size() + longValue + 1;
                        j = 0;
                    }
                    if (longValue < j) {
                        longValue = 1;
                    }
                }
                String m962u03 = next.m962u0();
                if (m962u03 == m897d || (m962u03 != null && m962u03.equals(m897d))) {
                    if (longValue == (C0207h.m1173b(next.mo925d(atm.m897d("2F3625260D152F252E340B0723343E3014"))) ? -1 : Integer.parseInt(mo925d))) {
                        c0459g.add(next);
                    }
                } else if (longValue == C0277c.m1069f(next, m428G())) {
                    c0459g.add(next);
                }
            } else if (c0525f.m440l()) {
                if (c0525f.m451a().booleanValue()) {
                    c0459g.add(next);
                }
            } else if (c0525f.m434r()) {
                if (C0207h.m1171d(c0525f.m445g())) {
                    c0459g.add(next);
                }
            } else if (c0525f.m438n()) {
                if (c0525f.m448d().size() > 0) {
                    c0459g.add(next);
                }
            } else if (!c0525f.m436p()) {
                throw new C0584e(atm.m897d("1F14111B232F045A1F0D3C2A4A0C1B1976") + c0525f);
            } else if (c0525f.m447e().size() > 0) {
                c0459g.add(next);
            }
        }
        return new C0525f(c0459g);
    }

    @Override // com.github.catvod.spider.merge.p033e0.InterfaceC0491E
    /* renamed from: k */
    public final C0525f mo418k(C0514w c0514w) {
        List<C0507p> m1320k = c0514w.m1320k(C0507p.class);
        if (m1320k != null) {
            if (m1320k.size() > 1) {
                LinkedList linkedList = new LinkedList();
                for (C0507p c0507p : m1320k) {
                    C0525f c0525f = (C0525f) c0507p.mo476a(this);
                    if (c0525f != null) {
                        linkedList.add(c0525f.m445g());
                    }
                }
                return new C0525f(C0207h.m1170e(linkedList, atm.m897d("50")));
            }
            return (C0525f) ((InterfaceC0194b) m1320k.get(0)).mo476a(this);
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.p033e0.InterfaceC0491E
    /* renamed from: l */
    public final C0525f mo417l(C0513v c0513v) {
        C0525f c0525f;
        InterfaceC0194b m477n;
        if (c0513v.m478m() != null && !c0513v.m478m().m1389f()) {
            m477n = c0513v.m478m();
        } else if (c0513v.m477n() == null || c0513v.m477n().m1389f()) {
            if (c0513v.m1319l(39) != null) {
                c0525f = new C0525f(c0513v.m1319l(39).getText());
                c0525f.m442j();
            } else if (c0513v.m1319l(6) != null) {
                String text = c0513v.m1319l(6).getText();
                c0525f = new C0525f(text == null ? null : Double.valueOf(text));
            } else {
                StringBuilder m635a = C0424a.m635a(atm.m897d("04150E553F2D1A0A150738781C1B081C2D3A061F28102A3D181F14162962"));
                m635a.append(c0513v.getText());
                throw new C0584e(m635a.toString());
            }
            return c0525f;
        } else {
            m477n = c0513v.m477n();
        }
        return (C0525f) m477n.mo476a(this);
    }

    @Override // com.github.catvod.spider.merge.p033e0.InterfaceC0491E
    /* renamed from: m */
    public final C0525f mo416m(C0508q c0508q) {
        InterfaceC0194b m481m;
        String text = c0508q.getText();
        String m897d = atm.m897d("40");
        if (m897d.equals(text)) {
            C0525f c0525f = new C0525f(m897d);
            c0525f.m442j();
            return c0525f;
        }
        if (c0508q.m480n() != null && !c0508q.m480n().m1389f()) {
            m481m = c0508q.m480n();
        } else if (c0508q.m481m() == null || c0508q.m481m().m1389f()) {
            return null;
        } else {
            m481m = c0508q.m481m();
        }
        return (C0525f) m481m.mo476a(this);
    }

    @Override // com.github.catvod.spider.merge.p033e0.InterfaceC0491E
    /* renamed from: n */
    public final C0525f mo415n(C0500i c0500i) {
        return (C0525f) ((C0510s) c0500i.m1321j(C0510s.class)).mo476a(this);
    }

    @Override // com.github.catvod.spider.merge.p033e0.InterfaceC0491E
    /* renamed from: o */
    public final C0525f mo414o(C0499h c0499h) {
        C0525f c0525f;
        List m1320k = c0499h.m1320k(C0515x.class);
        boolean z = true;
        boolean z2 = false;
        if (m1320k.size() == 1) {
            return (C0525f) ((InterfaceC0194b) m1320k.get(0)).mo476a(this);
        }
        if (m1320k.size() == 2) {
            C0525f c0525f2 = (C0525f) ((InterfaceC0194b) m1320k.get(0)).mo476a(this);
            C0525f c0525f3 = (C0525f) ((InterfaceC0194b) m1320k.get(1)).mo476a(this);
            if (atm.m897d("57").equals(c0499h.f933g.getText())) {
                if (c0525f2.m433s().equals(c0525f3.m433s())) {
                    if (c0525f2 != c0525f3 && !c0525f2.equals(c0525f3)) {
                        z = false;
                    }
                    c0525f = new C0525f(Boolean.valueOf(z));
                } else {
                    String m445g = c0525f2.m445g();
                    String m445g2 = c0525f3.m445g();
                    if (m445g != m445g2 && (m445g == null || !m445g.equals(m445g2))) {
                        z = false;
                    }
                    c0525f = new C0525f(Boolean.valueOf(z));
                }
            } else if (c0525f2.m433s().equals(c0525f3.m433s())) {
                c0525f = new C0525f(Boolean.valueOf(!((c0525f2 == c0525f3 || c0525f2.equals(c0525f3)) ? true : true)));
            } else {
                String m445g3 = c0525f2.m445g();
                String m445g4 = c0525f3.m445g();
                if (m445g3 == m445g4 || (m445g3 != null && m445g3.equals(m445g4))) {
                    z2 = true;
                }
                c0525f = new C0525f(Boolean.valueOf(!z2));
            }
            return c0525f;
        }
        StringBuilder m635a = C0424a.m635a(atm.m897d("0F08081A3E780F0B0F1420311E033F0D3C2A4A141F143E62"));
        m635a.append(c0499h.getText());
        throw new C0584e(m635a.toString());
    }

    @Override // com.github.catvod.spider.merge.p033e0.InterfaceC0491E
    /* renamed from: p */
    public final C0525f mo413p(C0488B c0488b) {
        C0525f c0525f;
        C0293m c0293m;
        if (c0488b.m566m() == null && !c0488b.m566m().m1389f()) {
            return (C0525f) ((C0488B) c0488b.m1321j(C0488B.class)).mo476a(this);
        }
        C0525f c0525f2 = (C0525f) c0488b.m566m().mo476a(this);
        if (c0488b.f919g != null) {
            this.f950a.push(C0524e.m459d(m428G().m458e()));
            C0525f c0525f3 = (C0525f) ((C0488B) c0488b.m1321j(C0488B.class)).mo476a(this);
            this.f950a.pop();
            boolean m438n = c0525f2.m438n();
            String m897d = atm.m897d("3C");
            if (!m438n) {
                if (c0525f2.m434r()) {
                    if (c0525f3.m438n()) {
                        c0293m = new C0293m(m897d);
                        c0293m.m991Q(c0525f2.m445g());
                        c0525f3.m448d().add(c0293m);
                        return c0525f3;
                    }
                    c0525f = new C0525f(c0525f2.m445g() + c0525f3.m445g());
                    return c0525f;
                }
                boolean m440l = c0525f2.m440l();
                String m897d2 = atm.m897d("460C1B197E65");
                String m897d3 = atm.m897d("091B145522371E5A17103E3F0F5A0C14206957");
                if (m440l) {
                    if (c0525f3.m440l()) {
                        c0525f = new C0525f(Boolean.valueOf(c0525f3.m451a().booleanValue() | c0525f2.m451a().booleanValue()));
                    } else if (c0525f3.m438n()) {
                        c0293m = new C0293m(m897d);
                        c0293m.m991Q(c0525f2.m445g());
                        c0525f3.m448d().add(c0293m);
                        return c0525f3;
                    } else if (c0525f3.m434r()) {
                        c0525f = new C0525f(c0525f2.m451a() + c0525f3.m445g());
                    } else {
                        StringBuilder m635a = C0424a.m635a(m897d3);
                        m635a.append(c0525f2.m451a());
                        m635a.append(m897d2);
                        m635a.append(c0525f3.m445g());
                        throw new C0583d(m635a.toString());
                    }
                    return c0525f;
                }
                if (!c0525f2.m435q()) {
                    LinkedList linkedList = new LinkedList();
                    if (C0207h.m1171d(c0525f2.m445g())) {
                        linkedList.add(c0525f2.m445g());
                    }
                    if (C0207h.m1171d(c0525f3.m445g())) {
                        linkedList.add(c0525f3.m445g());
                    }
                    c0525f = new C0525f(C0207h.m1170e(linkedList, atm.m897d("46")));
                } else if (c0525f3.m434r()) {
                    c0525f = new C0525f(c0525f2.m449c() + c0525f3.m445g());
                } else if (c0525f3.m438n()) {
                    c0293m = new C0293m(m897d);
                    c0293m.m991Q(c0525f2.m445g());
                    c0525f3.m448d().add(c0293m);
                    return c0525f3;
                } else {
                    StringBuilder m635a2 = C0424a.m635a(m897d3);
                    m635a2.append(c0525f2.m449c());
                    m635a2.append(m897d2);
                    m635a2.append(c0525f3.m445g());
                    throw new C0583d(m635a2.toString());
                }
                return c0525f;
            } else if (c0525f3.m438n()) {
                c0525f2.m448d().addAll(c0525f3.m448d());
            } else {
                C0293m c0293m2 = new C0293m(m897d);
                c0293m2.m991Q(c0525f3.m445g());
                c0525f2.m448d().add(c0293m2);
            }
        }
        return c0525f2;
    }

    @Override // com.github.catvod.spider.merge.p033e0.InterfaceC0491E
    /* renamed from: q */
    public final C0525f mo412q(C0487A c0487a) {
        C0525f c0525f = (C0525f) ((C0488B) c0487a.m1321j(C0488B.class)).mo476a(this);
        return c0487a.f918g == null ? c0525f : new C0525f(Double.valueOf(-c0525f.m449c().doubleValue()));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, com.github.catvod.spider.merge.f0.f] */
    @Override // com.github.catvod.spider.merge.p033e0.InterfaceC0491E
    /* renamed from: s */
    public final C0525f mo411s(C0489C c0489c) {
        return mo1182r(c0489c);
    }

    @Override // com.github.catvod.spider.merge.p033e0.InterfaceC0491E
    /* renamed from: t */
    public final C0525f mo410t(C0506o c0506o) {
        if (c0506o.m482m() != null && !c0506o.m482m().m1389f()) {
            C0525f c0525f = (C0525f) ((C0487A) c0506o.m1321j(C0487A.class)).mo476a(this);
            C0525f c0525f2 = (C0525f) c0506o.m482m().mo476a(this);
            switch (c0506o.f934g.getType()) {
                case 17:
                    return new C0525f(Double.valueOf(c0525f2.m449c().doubleValue() * c0525f.m449c().doubleValue()));
                case 18:
                    return new C0525f(Double.valueOf(c0525f.m449c().doubleValue() / c0525f2.m449c().doubleValue()));
                case 19:
                    return new C0525f(Double.valueOf(c0525f.m449c().doubleValue() % c0525f2.m449c().doubleValue()));
                default:
                    StringBuilder m635a = C0424a.m635a(atm.m897d("190314012D204A1F0807232A465A"));
                    m635a.append(c0506o.getText());
                    throw new C0584e(m635a.toString());
            }
        }
        return (C0525f) ((C0487A) c0506o.m1321j(C0487A.class)).mo476a(this);
    }

    @Override // com.github.catvod.spider.merge.p033e0.InterfaceC0491E
    /* renamed from: u */
    public final C0525f mo409u(C0515x c0515x) {
        C0525f c0525f;
        List m1320k = c0515x.m1320k(C0496e.class);
        if (m1320k.size() == 1) {
            return (C0525f) ((InterfaceC0194b) m1320k.get(0)).mo476a(this);
        }
        if (m1320k.size() == 2) {
            C0525f c0525f2 = (C0525f) ((InterfaceC0194b) m1320k.get(0)).mo476a(this);
            C0525f c0525f3 = (C0525f) ((InterfaceC0194b) m1320k.get(1)).mo476a(this);
            switch (c0515x.f936g.getType()) {
                case 24:
                    c0525f = new C0525f(Boolean.valueOf(c0525f2.compareTo(c0525f3) < 0));
                    break;
                case 25:
                    c0525f = new C0525f(Boolean.valueOf(c0525f2.compareTo(c0525f3) > 0));
                    break;
                case 26:
                    c0525f = new C0525f(Boolean.valueOf(c0525f2.compareTo(c0525f3) <= 0));
                    break;
                case 27:
                    c0525f = new C0525f(Boolean.valueOf(c0525f2.compareTo(c0525f3) >= 0));
                    break;
                case 28:
                case 29:
                default:
                    StringBuilder m635a = C0424a.m635a(atm.m897d("1F14111B232F045A1505292A0B0E1507"));
                    m635a.append(c0515x.f936g.getText());
                    throw new C0584e(m635a.toString());
                case 30:
                    c0525f = new C0525f(Boolean.valueOf(c0525f2.m445g().startsWith(c0525f3.m445g())));
                    break;
                case 31:
                    c0525f = new C0525f(Boolean.valueOf(c0525f2.m445g().endsWith(c0525f3.m445g())));
                    break;
                case 32:
                    c0525f = new C0525f(Boolean.valueOf(c0525f2.m445g().contains(c0525f3.m445g())));
                    break;
                case 33:
                    c0525f = new C0525f(Boolean.valueOf(c0525f2.m445g().matches(c0525f3.m445g())));
                    break;
                case 34:
                    c0525f = new C0525f(Boolean.valueOf(!c0525f2.m445g().matches(c0525f3.m445g())));
                    break;
            }
            return c0525f;
        }
        StringBuilder m635a2 = C0424a.m635a(atm.m897d("0F08081A3E780F0B0F1420311E033F0D3C2A4A141F143E62"));
        m635a2.append(c0515x.getText());
        throw new C0584e(m635a2.toString());
    }

    @Override // com.github.catvod.spider.merge.p033e0.InterfaceC0491E
    /* renamed from: v */
    public final C0525f mo408v(C0511t c0511t) {
        InterfaceC0194b interfaceC0194b;
        if (c0511t.m479m() == null || c0511t.m479m().m1389f()) {
            InterfaceC0069D interfaceC0069D = c0511t.f935g;
            if (interfaceC0069D == null) {
                interfaceC0194b = (C0501j) c0511t.m1321j(C0501j.class);
            } else {
                if (atm.m897d("4555").equals(interfaceC0069D.getText())) {
                    m428G().m455h();
                }
                interfaceC0194b = (C0516y) c0511t.m1321j(C0516y.class);
            }
        } else {
            interfaceC0194b = c0511t.m479m();
        }
        return (C0525f) interfaceC0194b.mo476a(this);
    }

    @Override // com.github.catvod.spider.merge.p033e0.InterfaceC0491E
    /* renamed from: w */
    public final C0525f mo407w(C0505n c0505n) {
        return (C0525f) ((C0500i) c0505n.m1321j(C0500i.class)).mo476a(this);
    }

    @Override // com.github.catvod.spider.merge.p033e0.InterfaceC0491E
    /* renamed from: x */
    public final C0525f mo406x(C0501j c0501j) {
        return (C0525f) ((C0513v) c0501j.m1321j(C0513v.class)).mo476a(this);
    }

    @Override // com.github.catvod.spider.merge.p033e0.InterfaceC0491E
    /* renamed from: y */
    public final C0525f mo405y(C0498g c0498g) {
        if (c0498g.m1319l(7) != null) {
            return C0608a.m241c(c0498g.m1319l(7).getText()).mo396a(m428G().m462a());
        }
        if (atm.m897d("2A").equals(c0498g.getText())) {
            C0525f c0525f = new C0525f(null);
            c0525f.m444h();
            return c0525f;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.p033e0.InterfaceC0491E
    /* renamed from: z */
    public final C0525f mo404z(C0502k c0502k) {
        LinkedList linkedList = new LinkedList();
        C0525f c0525f = (C0525f) ((C0503l) c0502k.m1321j(C0503l.class)).mo476a(this);
        for (C0500i c0500i : c0502k.m1320k(C0500i.class)) {
            this.f950a.push(C0524e.m459d(m428G()));
            linkedList.add(c0500i.mo476a(this));
            this.f950a.pop();
        }
        return C0608a.m243a(c0525f.m445g()).mo322a(m428G(), linkedList);
    }
}
