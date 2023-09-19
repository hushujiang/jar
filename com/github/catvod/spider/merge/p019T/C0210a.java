package com.github.catvod.spider.merge.p019T;

/* renamed from: com.github.catvod.spider.merge.T.a */
/* loaded from: classes.dex */
public final class C0210a {

    /* renamed from: d */
    private static volatile AbstractC0218i f365d = AbstractC0218i.f369q;

    /* renamed from: a */
    private final StringBuffer f366a;

    /* renamed from: b */
    private final Object f367b;

    /* renamed from: c */
    private final AbstractC0218i f368c;

    public C0210a(Object obj) {
        AbstractC0218i abstractC0218i = f365d;
        StringBuffer stringBuffer = new StringBuffer(512);
        this.f366a = stringBuffer;
        this.f368c = abstractC0218i;
        this.f367b = obj;
        abstractC0218i.m1137m(stringBuffer, obj);
    }

    /* renamed from: a */
    public final C0210a m1163a(Object obj) {
        this.f368c.mo1149a(this.f366a, obj);
        return this;
    }

    /* renamed from: b */
    public final C0210a m1162b(String str, boolean z) {
        this.f368c.m1148b(this.f366a, str, z);
        return this;
    }

    public final String toString() {
        Object obj = this.f367b;
        if (obj == null) {
            this.f366a.append(this.f368c.m1131s());
        } else {
            this.f368c.m1142h(this.f366a, obj);
        }
        return this.f366a.toString();
    }
}
