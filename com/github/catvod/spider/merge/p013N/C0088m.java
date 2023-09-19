package com.github.catvod.spider.merge.p013N;

/* renamed from: com.github.catvod.spider.merge.N.m */
/* loaded from: classes.dex */
public final class C0088m extends C0078c {
    public C0088m(InterfaceC0071F interfaceC0071F) {
        super(interfaceC0071F);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List<com.github.catvod.spider.merge.N.D>, java.util.ArrayList] */
    @Override // com.github.catvod.spider.merge.p013N.C0078c, com.github.catvod.spider.merge.p013N.InterfaceC0072G
    /* renamed from: g */
    public final InterfaceC0069D mo1359g(int i) {
        m1382m();
        if (i == 0) {
            return null;
        }
        if (i < 0) {
            return m1357p(-i);
        }
        int i2 = this.f120c;
        for (int i3 = 1; i3 < i; i3++) {
            int i4 = i2 + 1;
            if (m1380o(i4)) {
                i2 = m1381n(i4);
            }
        }
        return (InterfaceC0069D) this.f119b.get(i2);
    }

    @Override // com.github.catvod.spider.merge.p013N.C0078c
    /* renamed from: k */
    protected final int mo1358k(int i) {
        return m1381n(i);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List<com.github.catvod.spider.merge.N.D>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List<com.github.catvod.spider.merge.N.D>, java.util.ArrayList] */
    /* renamed from: p */
    protected final InterfaceC0069D m1357p(int i) {
        if (i != 0) {
            int i2 = this.f120c;
            if (i2 - i >= 0) {
                for (int i3 = 1; i3 <= i && i2 > 0; i3++) {
                    i2--;
                    m1380o(i2);
                    if (i2 >= size()) {
                        i2 = size() - 1;
                    } else {
                        while (i2 >= 0) {
                            InterfaceC0069D interfaceC0069D = (InterfaceC0069D) this.f119b.get(i2);
                            if (interfaceC0069D.getType() != -1 && interfaceC0069D.getChannel() != 0) {
                                i2--;
                            }
                        }
                    }
                }
                if (i2 < 0) {
                    return null;
                }
                return (InterfaceC0069D) this.f119b.get(i2);
            }
        }
        return null;
    }
}
