package com.github.catvod.spider.merge.p018S;

import java.util.function.Supplier;

/* renamed from: com.github.catvod.spider.merge.S.i */
/* loaded from: classes.dex */
public final /* synthetic */ class C0208i implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ String f363a;

    /* renamed from: b */
    public final /* synthetic */ Object[] f364b;

    public /* synthetic */ C0208i(String str, Object[] objArr) {
        this.f363a = str;
        this.f364b = objArr;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return String.format(this.f363a, this.f364b);
    }
}
