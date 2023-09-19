package com.github.catvod.spider.merge.p013N;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p014O.C0103B;
import com.github.catvod.spider.merge.p016Q.C0187i;
import com.github.catvod.spider.merge.p016Q.C0188j;
import com.github.catvod.spider.merge.p016Q.C0191m;
import com.github.catvod.spider.merge.p028c.C0424a;

/* renamed from: com.github.catvod.spider.merge.N.s */
/* loaded from: classes.dex */
public abstract class AbstractC0094s extends AbstractC0067B<Integer, C0103B> implements InterfaceC0071F {

    /* renamed from: d */
    public InterfaceC0079d f152d;

    /* renamed from: e */
    protected C0191m<InterfaceC0071F, InterfaceC0079d> f153e;

    /* renamed from: g */
    public InterfaceC0069D f155g;

    /* renamed from: i */
    public int f157i;

    /* renamed from: j */
    public int f158j;

    /* renamed from: k */
    public boolean f159k;

    /* renamed from: l */
    public int f160l;

    /* renamed from: m */
    public int f161m;

    /* renamed from: f */
    protected InterfaceC0070E<?> f154f = C0087l.f145a;

    /* renamed from: h */
    public int f156h = -1;

    /* renamed from: n */
    public final C0187i f162n = new C0187i();

    /* renamed from: o */
    public int f163o = 0;

    public AbstractC0094s(InterfaceC0079d interfaceC0079d) {
        this.f152d = interfaceC0079d;
        this.f153e = new C0191m<>(this, interfaceC0079d);
    }

    @Override // com.github.catvod.spider.merge.p013N.InterfaceC0071F
    /* renamed from: a */
    public final int mo1340a() {
        return ((C0103B) this.f108b).m1304g();
    }

    @Override // com.github.catvod.spider.merge.p013N.InterfaceC0071F
    /* renamed from: b */
    public final InterfaceC0079d mo1339b() {
        return this.f152d;
    }

    @Override // com.github.catvod.spider.merge.p013N.InterfaceC0071F
    /* renamed from: c */
    public final InterfaceC0070E<? extends InterfaceC0069D> mo1338c() {
        return this.f154f;
    }

    @Override // com.github.catvod.spider.merge.p013N.InterfaceC0071F
    public final int getLine() {
        return ((C0103B) this.f108b).m1303h();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.github.catvod.spider.merge.N.E<?>, com.github.catvod.spider.merge.N.l] */
    /* renamed from: j */
    public final InterfaceC0069D m1337j() {
        int m1304g = ((C0103B) this.f108b).m1304g();
        InterfaceC0069D m1360a = this.f154f.m1360a(this.f153e, -1, null, 0, this.f152d.mo1342i(), this.f152d.mo1342i() - 1, ((C0103B) this.f108b).m1303h(), m1304g);
        this.f155g = m1360a;
        return m1360a;
    }

    /* renamed from: k */
    public final void m1336k(C0095t c0095t) {
        char[] charArray;
        InterfaceC0079d interfaceC0079d = this.f152d;
        String mo1366c = interfaceC0079d.mo1366c(C0188j.m1206b(this.f156h, interfaceC0079d.mo1342i()));
        StringBuilder m635a = C0424a.m635a(atm.m897d("1E1511102278181F191A2B36030E131A22780F08081A3E780B0E40556B"));
        StringBuilder sb = new StringBuilder();
        for (char c : mo1366c.toCharArray()) {
            String valueOf = String.valueOf(c);
            if (c == 65535) {
                valueOf = atm.m897d("563F353372");
            } else if (c == '\r') {
                valueOf = atm.m897d("3608");
            } else if (c == '\t') {
                valueOf = atm.m897d("360E");
            } else if (c == '\n') {
                valueOf = atm.m897d("3614");
            }
            sb.append(valueOf);
        }
        m635a.append(sb.toString());
        m635a.append(atm.m897d("4D"));
        ((C0100y) m1393e()).mo1316c(this, null, this.f157i, this.f158j, m635a.toString(), c0095t);
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [com.github.catvod.spider.merge.N.E<?>, com.github.catvod.spider.merge.N.l] */
    @Override // com.github.catvod.spider.merge.p013N.InterfaceC0071F
    public final InterfaceC0069D nextToken() {
        int i;
        InterfaceC0079d interfaceC0079d = this.f152d;
        if (interfaceC0079d != null) {
            interfaceC0079d.mo1345e();
            while (true) {
                try {
                    if (this.f159k) {
                        m1337j();
                        break;
                    }
                    this.f155g = null;
                    this.f160l = 0;
                    this.f156h = this.f152d.mo1342i();
                    this.f158j = ((C0103B) this.f108b).m1304g();
                    this.f157i = ((C0103B) this.f108b).m1303h();
                    while (true) {
                        this.f161m = 0;
                        try {
                            i = ((C0103B) this.f108b).m1302i(this.f152d, this.f163o);
                        } catch (C0095t e) {
                            m1336k(e);
                            if (this.f152d.mo1343h(1) != -1) {
                                ((C0103B) this.f108b).m1306e(this.f152d);
                            }
                            i = -3;
                        }
                        if (this.f152d.mo1343h(1) == -1) {
                            this.f159k = true;
                        }
                        if (this.f161m == 0) {
                            this.f161m = i;
                        }
                        int i2 = this.f161m;
                        if (i2 == -3) {
                            break;
                        } else if (i2 != -2) {
                            if (this.f155g == null) {
                                this.f155g = this.f154f.m1360a(this.f153e, i2, null, this.f160l, this.f156h, this.f152d.mo1342i() - 1, this.f157i, this.f158j);
                            }
                        }
                    }
                } finally {
                    this.f152d.mo1346a();
                }
            }
            return this.f155g;
        }
        throw new IllegalStateException(atm.m897d("041F02011837011F14553E3D1B0F1307292B4A1B5A1B233647140F19207803140A003878190E08102D3544"));
    }
}
