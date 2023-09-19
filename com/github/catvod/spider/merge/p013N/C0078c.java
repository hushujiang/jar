package com.github.catvod.spider.merge.p013N;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p016Q.C0188j;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.github.catvod.spider.merge.N.c */
/* loaded from: classes.dex */
public class C0078c implements InterfaceC0072G {

    /* renamed from: a */
    protected InterfaceC0071F f118a;

    /* renamed from: b */
    protected List<InterfaceC0069D> f119b = new ArrayList(100);

    /* renamed from: c */
    protected int f120c = -1;

    /* renamed from: d */
    protected boolean f121d;

    public C0078c(InterfaceC0071F interfaceC0071F) {
        this.f118a = interfaceC0071F;
    }

    @Override // com.github.catvod.spider.merge.p013N.InterfaceC0093r
    /* renamed from: a */
    public final void mo1346a() {
    }

    @Override // com.github.catvod.spider.merge.p013N.InterfaceC0072G
    /* renamed from: b */
    public final InterfaceC0071F mo1385b() {
        return this.f118a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<com.github.catvod.spider.merge.N.D>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List<com.github.catvod.spider.merge.N.D>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.List<com.github.catvod.spider.merge.N.D>, java.util.ArrayList] */
    @Override // com.github.catvod.spider.merge.p013N.InterfaceC0072G
    /* renamed from: d */
    public final String mo1384d(InterfaceC0069D interfaceC0069D, InterfaceC0069D interfaceC0069D2) {
        if (interfaceC0069D != null && interfaceC0069D2 != null) {
            C0188j m1206b = C0188j.m1206b(interfaceC0069D.mo1362c(), interfaceC0069D2.mo1362c());
            int i = m1206b.f343a;
            int i2 = m1206b.f344b;
            if (i >= 0 && i2 >= 0) {
                m1382m();
                do {
                } while (m1383l(1000) >= 1000);
                if (i2 >= this.f119b.size()) {
                    i2 = this.f119b.size() - 1;
                }
                StringBuilder sb = new StringBuilder();
                while (i <= i2) {
                    InterfaceC0069D interfaceC0069D3 = (InterfaceC0069D) this.f119b.get(i);
                    if (interfaceC0069D3.getType() == -1) {
                        break;
                    }
                    sb.append(interfaceC0069D3.getText());
                    i++;
                }
                return sb.toString();
            }
        }
        return "";
    }

    @Override // com.github.catvod.spider.merge.p013N.InterfaceC0093r
    /* renamed from: e */
    public final int mo1345e() {
        return 0;
    }

    @Override // com.github.catvod.spider.merge.p013N.InterfaceC0093r
    /* renamed from: f */
    public final void mo1344f(int i) {
        m1382m();
        this.f120c = mo1358k(i);
    }

    @Override // com.github.catvod.spider.merge.p013N.InterfaceC0072G
    /* renamed from: g */
    public InterfaceC0069D mo1359g(int i) {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<com.github.catvod.spider.merge.N.D>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List<com.github.catvod.spider.merge.N.D>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List<com.github.catvod.spider.merge.N.D>, java.util.ArrayList] */
    @Override // com.github.catvod.spider.merge.p013N.InterfaceC0072G
    public final InterfaceC0069D get(int i) {
        if (i < 0 || i >= this.f119b.size()) {
            StringBuilder sb = new StringBuilder();
            sb.append(atm.m897d("1E151110227803141E103478"));
            sb.append(i);
            sb.append(atm.m897d("4A150F016C370C5A0814223F0F5A4A5B62"));
            sb.append(this.f119b.size() - 1);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        return (InterfaceC0069D) this.f119b.get(i);
    }

    @Override // com.github.catvod.spider.merge.p013N.InterfaceC0093r
    /* renamed from: h */
    public final int mo1343h(int i) {
        return mo1359g(i).getType();
    }

    @Override // com.github.catvod.spider.merge.p013N.InterfaceC0093r
    /* renamed from: i */
    public final int mo1342i() {
        return this.f120c;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List<com.github.catvod.spider.merge.N.D>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List<com.github.catvod.spider.merge.N.D>, java.util.ArrayList] */
    @Override // com.github.catvod.spider.merge.p013N.InterfaceC0093r
    /* renamed from: j */
    public final void mo1341j() {
        int i = this.f120c;
        if (!(i >= 0 && (!this.f121d ? i >= this.f119b.size() : i >= this.f119b.size() - 1)) && mo1343h(1) == -1) {
            throw new IllegalStateException(atm.m897d("091B141B232C4A19151B3F2D071F5A30031E"));
        }
        if (m1380o(this.f120c + 1)) {
            this.f120c = mo1358k(this.f120c + 1);
        }
    }

    /* renamed from: k */
    protected int mo1358k(int i) {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List<com.github.catvod.spider.merge.N.D>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List<com.github.catvod.spider.merge.N.D>, java.util.ArrayList] */
    /* renamed from: l */
    protected final int m1383l(int i) {
        if (this.f121d) {
            return 0;
        }
        for (int i2 = 0; i2 < i; i2++) {
            InterfaceC0069D nextToken = this.f118a.nextToken();
            if (nextToken instanceof InterfaceC0075J) {
                ((InterfaceC0075J) nextToken).mo1361d(this.f119b.size());
            }
            this.f119b.add(nextToken);
            if (nextToken.getType() == -1) {
                this.f121d = true;
                return i2 + 1;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public final void m1382m() {
        if (this.f120c == -1) {
            m1380o(0);
            this.f120c = mo1358k(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<com.github.catvod.spider.merge.N.D>, java.util.ArrayList] */
    /* renamed from: n */
    public final int m1381n(int i) {
        m1380o(i);
        if (i >= size()) {
            return size() - 1;
        }
        while (true) {
            InterfaceC0069D interfaceC0069D = (InterfaceC0069D) this.f119b.get(i);
            if (interfaceC0069D.getChannel() == 0 || interfaceC0069D.getType() == -1) {
                return i;
            }
            i++;
            m1380o(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.N.D>, java.util.ArrayList] */
    /* renamed from: o */
    public final boolean m1380o(int i) {
        int size = (i - this.f119b.size()) + 1;
        return size <= 0 || m1383l(size) >= size;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.N.D>, java.util.ArrayList] */
    @Override // com.github.catvod.spider.merge.p013N.InterfaceC0093r
    public final int size() {
        return this.f119b.size();
    }
}
