package com.github.catvod.spider.merge.p060v;

import java.util.concurrent.Future;

/* renamed from: com.github.catvod.spider.merge.v.C */
/* loaded from: classes.dex */
public abstract class AbstractC0698C<V> extends AbstractFutureC0699D<V> {

    /* renamed from: a */
    private final InterfaceFutureC0708M<V> f1314a;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0698C(InterfaceFutureC0708M<V> interfaceFutureC0708M) {
        this.f1314a = interfaceFutureC0708M;
    }

    @Override // com.github.catvod.spider.merge.p057s.AbstractC0674a
    /* renamed from: b */
    protected final Object mo86b() {
        return this.f1314a;
    }

    @Override // com.github.catvod.spider.merge.p060v.AbstractFutureC0699D
    /* renamed from: c */
    protected final InterfaceFutureC0708M<V> mo85c() {
        return this.f1314a;
    }

    @Override // com.github.catvod.spider.merge.p060v.AbstractFutureC0699D
    /* renamed from: d */
    protected final Future mo84d() {
        return this.f1314a;
    }
}
