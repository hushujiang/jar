package com.github.catvod.spider.merge.p025a0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p023Y.C0277c;
import com.github.catvod.spider.merge.p023Y.C0278d;
import com.github.catvod.spider.merge.p024Z.C0280b;
import com.github.catvod.spider.merge.p027b0.C0319E;
import com.github.catvod.spider.merge.p029c0.C0441O;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.github.catvod.spider.merge.a0.s */
/* loaded from: classes.dex */
public abstract class AbstractC0299s implements Cloneable {

    /* renamed from: c */
    static final List<AbstractC0299s> f557c = Collections.emptyList();

    /* renamed from: a */
    AbstractC0299s f558a;

    /* renamed from: b */
    int f559b;

    /* renamed from: B */
    private void m935B(int i) {
        int mo903h = mo903h();
        if (mo903h == 0) {
            return;
        }
        List<AbstractC0299s> mo918n = mo918n();
        while (i < mo903h) {
            mo918n.get(i).f559b = i;
            i++;
        }
    }

    /* renamed from: A */
    public final AbstractC0299s m936A() {
        return this.f558a;
    }

    /* renamed from: C */
    public final void m934C() {
        C0277c.m1063l(this.f558a);
        this.f558a.mo933D(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: D */
    public void mo933D(AbstractC0299s abstractC0299s) {
        C0277c.m1067h(abstractC0299s.f558a == this);
        int i = abstractC0299s.f559b;
        mo918n().remove(i);
        m935B(i);
        abstractC0299s.f558a = null;
    }

    /* renamed from: E */
    public final void m932E(AbstractC0299s abstractC0299s) {
        C0277c.m1063l(this.f558a);
        AbstractC0299s abstractC0299s2 = this.f558a;
        abstractC0299s2.getClass();
        C0277c.m1067h(this.f558a == abstractC0299s2);
        AbstractC0299s abstractC0299s3 = abstractC0299s.f558a;
        if (abstractC0299s3 != null) {
            abstractC0299s3.mo933D(abstractC0299s);
        }
        int i = this.f559b;
        abstractC0299s2.mo918n().set(i, abstractC0299s);
        abstractC0299s.f558a = abstractC0299s2;
        abstractC0299s.f559b = i;
        this.f558a = null;
    }

    /* renamed from: F */
    public AbstractC0299s mo931F() {
        AbstractC0299s abstractC0299s = this;
        while (true) {
            AbstractC0299s abstractC0299s2 = abstractC0299s.f558a;
            if (abstractC0299s2 == null) {
                return abstractC0299s;
            }
            abstractC0299s = abstractC0299s2;
        }
    }

    /* renamed from: G */
    public final void m930G(String str) {
        mo919l(str);
    }

    /* renamed from: H */
    public final int m929H() {
        return this.f559b;
    }

    /* renamed from: a */
    public String mo928a(String str) {
        C0277c.m1065j(str);
        return (mo916p() && mo924e().m1030o(str)) ? C0280b.m1051i(mo923f(), mo924e().m1032m(str)) : "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final void m927b(int i, AbstractC0299s... abstractC0299sArr) {
        boolean z;
        C0277c.m1063l(abstractC0299sArr);
        if (abstractC0299sArr.length == 0) {
            return;
        }
        List<AbstractC0299s> mo918n = mo918n();
        AbstractC0299s mo909z = abstractC0299sArr[0].mo909z();
        if (mo909z != null && mo909z.mo903h() == abstractC0299sArr.length) {
            List<AbstractC0299s> mo918n2 = mo909z.mo918n();
            int length = abstractC0299sArr.length;
            while (true) {
                int i2 = length - 1;
                if (length <= 0) {
                    z = true;
                    break;
                } else if (abstractC0299sArr[i2] != mo918n2.get(i2)) {
                    z = false;
                    break;
                } else {
                    length = i2;
                }
            }
            if (z) {
                boolean z2 = mo903h() == 0;
                mo909z.mo901m();
                mo918n.addAll(i, Arrays.asList(abstractC0299sArr));
                int length2 = abstractC0299sArr.length;
                while (true) {
                    int i3 = length2 - 1;
                    if (length2 <= 0) {
                        break;
                    }
                    abstractC0299sArr[i3].f558a = this;
                    length2 = i3;
                }
                if (z2 && abstractC0299sArr[0].f559b == 0) {
                    return;
                }
                m935B(i);
                return;
            }
        }
        for (AbstractC0299s abstractC0299s : abstractC0299sArr) {
            if (abstractC0299s == null) {
                throw new C0278d(atm.m897d("2B0808143578070F09016C36050E5A1623361E1B131B6C3904035A1B3934065A1517263D090E09"));
            }
        }
        for (AbstractC0299s abstractC0299s2 : abstractC0299sArr) {
            abstractC0299s2.getClass();
            AbstractC0299s abstractC0299s3 = abstractC0299s2.f558a;
            if (abstractC0299s3 != null) {
                abstractC0299s3.mo933D(abstractC0299s2);
            }
            abstractC0299s2.f558a = this;
        }
        mo918n.addAll(i, Arrays.asList(abstractC0299sArr));
        m935B(i);
    }

    /* renamed from: c */
    public AbstractC0299s mo926c(String str, String str2) {
        C0300t.m908a(this).getClass();
        mo924e().m1021x(C0319E.f664c.m854b(str), str2);
        return this;
    }

    /* renamed from: d */
    public String mo925d(String str) {
        C0277c.m1063l(str);
        if (mo916p()) {
            String m1032m = mo924e().m1032m(str);
            return m1032m.length() > 0 ? m1032m : str.startsWith(atm.m897d("0B18094F")) ? mo928a(str.substring(4)) : "";
        }
        return "";
    }

    /* renamed from: e */
    public abstract C0283c mo924e();

    public final boolean equals(Object obj) {
        return this == obj;
    }

    /* renamed from: f */
    public abstract String mo923f();

    /* renamed from: g */
    public final AbstractC0299s m922g(int i) {
        return mo918n().get(i);
    }

    /* renamed from: h */
    public abstract int mo903h();

    public final int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i */
    public final List<AbstractC0299s> m921i() {
        if (mo903h() == 0) {
            return f557c;
        }
        List<AbstractC0299s> mo918n = mo918n();
        ArrayList arrayList = new ArrayList(mo918n.size());
        arrayList.addAll(mo918n);
        return Collections.unmodifiableList(arrayList);
    }

    @Override // 
    /* renamed from: j */
    public AbstractC0299s clone() {
        AbstractC0299s mo920k = mo920k(null);
        LinkedList linkedList = new LinkedList();
        linkedList.add(mo920k);
        while (!linkedList.isEmpty()) {
            AbstractC0299s abstractC0299s = (AbstractC0299s) linkedList.remove();
            int mo903h = abstractC0299s.mo903h();
            for (int i = 0; i < mo903h; i++) {
                List<AbstractC0299s> mo918n = abstractC0299s.mo918n();
                AbstractC0299s mo920k2 = mo918n.get(i).mo920k(abstractC0299s);
                mo918n.set(i, mo920k2);
                linkedList.add(mo920k2);
            }
        }
        return mo920k;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public AbstractC0299s mo920k(AbstractC0299s abstractC0299s) {
        C0288h m910y;
        try {
            AbstractC0299s abstractC0299s2 = (AbstractC0299s) super.clone();
            abstractC0299s2.f558a = abstractC0299s;
            abstractC0299s2.f559b = abstractC0299s == null ? 0 : this.f559b;
            if (abstractC0299s == null && !(this instanceof C0288h) && (m910y = m910y()) != null) {
                C0288h m1004G0 = m910y.m1004G0();
                abstractC0299s2.f558a = m1004G0;
                m1004G0.mo918n().add(abstractC0299s2);
            }
            return abstractC0299s2;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: l */
    protected abstract void mo919l(String str);

    /* renamed from: m */
    public abstract AbstractC0299s mo901m();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public abstract List<AbstractC0299s> mo918n();

    /* renamed from: o */
    public final boolean m917o(String str) {
        C0277c.m1063l(str);
        if (mo916p()) {
            if (str.startsWith(atm.m897d("0B18094F"))) {
                String substring = str.substring(4);
                if (mo924e().m1030o(substring) && !mo928a(substring).isEmpty()) {
                    return true;
                }
            }
            return mo924e().m1030o(str);
        }
        return false;
    }

    /* renamed from: p */
    protected abstract boolean mo916p();

    /* renamed from: q */
    public final boolean m915q() {
        return this.f558a != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public final void m914r(Appendable appendable, int i, C0287g c0287g) {
        appendable.append('\n').append(C0280b.m1053g(c0287g.m1015d() * i, c0287g.m1014e()));
    }

    /* renamed from: s */
    public final AbstractC0299s m913s() {
        AbstractC0299s abstractC0299s = this.f558a;
        if (abstractC0299s == null) {
            return null;
        }
        List<AbstractC0299s> mo918n = abstractC0299s.mo918n();
        int i = this.f559b + 1;
        if (mo918n.size() > i) {
            return mo918n.get(i);
        }
        return null;
    }

    /* renamed from: t */
    public abstract String mo900t();

    public String toString() {
        return mo912u();
    }

    /* renamed from: u */
    public String mo912u() {
        StringBuilder m1058b = C0280b.m1058b();
        m911v(m1058b);
        return C0280b.m1052h(m1058b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: v */
    public final void m911v(Appendable appendable) {
        C0288h m910y = m910y();
        if (m910y == null) {
            m910y = new C0288h("");
        }
        C0441O.m622c(new C0298r(appendable, m910y.m1009B0()), this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public abstract void mo899w(Appendable appendable, int i, C0287g c0287g);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public abstract void mo898x(Appendable appendable, int i, C0287g c0287g);

    /* renamed from: y */
    public final C0288h m910y() {
        AbstractC0299s mo931F = mo931F();
        if (mo931F instanceof C0288h) {
            return (C0288h) mo931F;
        }
        return null;
    }

    /* renamed from: z */
    public AbstractC0299s mo909z() {
        return this.f558a;
    }
}
