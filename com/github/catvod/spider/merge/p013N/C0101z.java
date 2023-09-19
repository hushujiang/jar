package com.github.catvod.spider.merge.p013N;

import com.github.catvod.spider.merge.p016Q.C0189k;

/* renamed from: com.github.catvod.spider.merge.N.z */
/* loaded from: classes.dex */
public class C0101z extends RuntimeException {

    /* renamed from: a */
    private final AbstractC0067B<?, ?> f178a;

    /* renamed from: b */
    private final C0099x f179b;

    /* renamed from: c */
    private final InterfaceC0093r f180c;

    /* renamed from: d */
    private InterfaceC0069D f181d;

    /* renamed from: e */
    private int f182e;

    public C0101z(AbstractC0067B<?, ?> abstractC0067B, InterfaceC0093r interfaceC0093r, C0099x c0099x) {
        this.f182e = -1;
        this.f178a = abstractC0067B;
        this.f180c = interfaceC0093r;
        this.f179b = c0099x;
        if (abstractC0067B != null) {
            this.f182e = abstractC0067B.m1391g();
        }
    }

    /* renamed from: a */
    public final C0189k m1314a() {
        AbstractC0067B<?, ?> abstractC0067B = this.f178a;
        if (abstractC0067B != null) {
            return abstractC0067B.mo538d().m1270c(this.f182e, this.f179b);
        }
        return null;
    }

    /* renamed from: b */
    public final InterfaceC0093r m1313b() {
        return this.f180c;
    }

    /* renamed from: c */
    public final InterfaceC0069D m1312c() {
        return this.f181d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public final void m1311d(int i) {
        this.f182e = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public final void m1310e(InterfaceC0069D interfaceC0069D) {
        this.f181d = interfaceC0069D;
    }
}
