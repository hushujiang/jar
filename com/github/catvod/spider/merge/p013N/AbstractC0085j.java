package com.github.catvod.spider.merge.p013N;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p016Q.C0188j;
import com.github.catvod.spider.merge.p056r.C0653a;

/* renamed from: com.github.catvod.spider.merge.N.j */
/* loaded from: classes.dex */
public abstract class AbstractC0085j implements InterfaceC0079d {

    /* renamed from: a */
    protected final int f134a;

    /* renamed from: b */
    protected int f135b = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0085j(int i) {
        this.f134a = i;
    }

    /* renamed from: k */
    public static AbstractC0085j m1365k(C0081f c0081f) {
        int m139a = C0653a.m139a(c0081f.m1370e());
        if (m139a == 0) {
            int m1368g = c0081f.m1368g();
            int m1367h = c0081f.m1367h();
            byte[] m1372c = c0081f.m1372c();
            c0081f.m1374a();
            return new C0084i(m1368g, m1367h, m1372c);
        } else if (m139a == 1) {
            int m1368g2 = c0081f.m1368g();
            int m1367h2 = c0081f.m1367h();
            char[] m1371d = c0081f.m1371d();
            c0081f.m1374a();
            return new C0082g(m1368g2, m1367h2, m1371d);
        } else if (m139a == 2) {
            int m1368g3 = c0081f.m1368g();
            int m1367h3 = c0081f.m1367h();
            int[] m1369f = c0081f.m1369f();
            c0081f.m1374a();
            return new C0083h(m1368g3, m1367h3, m1369f);
        } else {
            throw new UnsupportedOperationException(atm.m897d("24150E553E3D0B19121028"));
        }
    }

    @Override // com.github.catvod.spider.merge.p013N.InterfaceC0093r
    /* renamed from: a */
    public final void mo1346a() {
    }

    @Override // com.github.catvod.spider.merge.p013N.InterfaceC0093r
    /* renamed from: e */
    public final int mo1345e() {
        return -1;
    }

    @Override // com.github.catvod.spider.merge.p013N.InterfaceC0093r
    /* renamed from: f */
    public final void mo1344f(int i) {
        this.f135b = i;
    }

    @Override // com.github.catvod.spider.merge.p013N.InterfaceC0093r
    /* renamed from: i */
    public final int mo1342i() {
        return this.f135b;
    }

    @Override // com.github.catvod.spider.merge.p013N.InterfaceC0093r
    /* renamed from: j */
    public final void mo1341j() {
        int i = this.f134a;
        int i2 = this.f135b;
        if (i - i2 == 0) {
            throw new IllegalStateException(atm.m897d("091B141B232C4A19151B3F2D071F5A30031E"));
        }
        this.f135b = i2 + 1;
    }

    @Override // com.github.catvod.spider.merge.p013N.InterfaceC0093r
    public final int size() {
        return this.f134a;
    }

    public final String toString() {
        return mo1366c(C0188j.m1206b(0, this.f134a - 1));
    }
}
