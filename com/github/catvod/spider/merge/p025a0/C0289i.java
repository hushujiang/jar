package com.github.catvod.spider.merge.p025a0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p023Y.C0277c;
import com.github.catvod.spider.merge.p024Z.C0280b;

/* renamed from: com.github.catvod.spider.merge.a0.i */
/* loaded from: classes.dex */
public final class C0289i extends AbstractC0297q {
    public C0289i(String str, String str2, String str3) {
        String m897d;
        C0277c.m1063l(str);
        C0277c.m1063l(str2);
        C0277c.m1063l(str3);
        super.mo926c(atm.m897d("041B1710"), str);
        String m897d2 = atm.m897d("1A0F1819253B231E");
        super.mo926c(m897d2, str2);
        String m897d3 = atm.m897d("190309012935231E");
        super.mo926c(m897d3, str3);
        if (m1002K(m897d2)) {
            m897d = atm.m897d("3A2F3839051B");
        } else if (!m1002K(m897d3)) {
            return;
        } else {
            m897d = atm.m897d("392329210915");
        }
        super.mo926c(atm.m897d("1A0F1826352B211F03"), m897d);
    }

    /* renamed from: K */
    private boolean m1002K(String str) {
        return !C0280b.m1056d(super.mo925d(str));
    }

    /* renamed from: L */
    public final void m1001L(String str) {
        if (str != null) {
            super.mo926c(atm.m897d("1A0F1826352B211F03"), str);
        }
    }

    @Override // com.github.catvod.spider.merge.p025a0.AbstractC0297q, com.github.catvod.spider.merge.p025a0.AbstractC0299s
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ int mo903h() {
        return 0;
    }

    @Override // com.github.catvod.spider.merge.p025a0.AbstractC0297q, com.github.catvod.spider.merge.p025a0.AbstractC0299s
    /* renamed from: m */
    public final AbstractC0299s mo901m() {
        return this;
    }

    @Override // com.github.catvod.spider.merge.p025a0.AbstractC0299s
    /* renamed from: t */
    public final String mo900t() {
        return atm.m897d("491E151638211A1F");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p025a0.AbstractC0299s
    /* renamed from: w */
    public final void mo899w(Appendable appendable, int i, C0287g c0287g) {
        if (this.f559b > 0 && c0287g.m1012g()) {
            appendable.append('\n');
        }
        int m1011h = c0287g.m1011h();
        String m897d = atm.m897d("190309012935231E");
        String m897d2 = atm.m897d("1A0F1819253B231E");
        appendable.append((m1011h != 1 || m1002K(m897d2) || m1002K(m897d)) ? atm.m897d("565B3E3A0F0C332A3F") : atm.m897d("565B1E1A2F2C130A1F"));
        String m897d3 = atm.m897d("041B1710");
        boolean m1002K = m1002K(m897d3);
        String m897d4 = atm.m897d("4A");
        if (m1002K) {
            appendable.append(m897d4).append(super.mo925d(m897d3));
        }
        String m897d5 = atm.m897d("1A0F1826352B211F03");
        if (m1002K(m897d5)) {
            appendable.append(m897d4).append(super.mo925d(m897d5));
        }
        boolean m1002K2 = m1002K(m897d2);
        String m897d6 = atm.m897d("4A58");
        if (m1002K2) {
            appendable.append(m897d6).append(super.mo925d(m897d2)).append('\"');
        }
        if (m1002K(m897d)) {
            appendable.append(m897d6).append(super.mo925d(m897d)).append('\"');
        }
        appendable.append('>');
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p025a0.AbstractC0299s
    /* renamed from: x */
    public final void mo898x(Appendable appendable, int i, C0287g c0287g) {
    }
}
