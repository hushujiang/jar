package com.github.catvod.spider.merge.p060v;

import com.github.catvod.spider.merge.p057s.AbstractC0676c;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.v.z */
/* loaded from: classes.dex */
public final class C0743z<V> extends AbstractC0737t<Object, V> {

    /* renamed from: p */
    private C0742y f1380p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0743z(AbstractC0676c abstractC0676c, Callable callable) {
        super(abstractC0676c);
        this.f1380p = new C0742y(this, callable);
        m40J();
    }

    @Override // com.github.catvod.spider.merge.p060v.AbstractC0737t
    /* renamed from: F */
    final void mo22F() {
    }

    @Override // com.github.catvod.spider.merge.p060v.AbstractC0737t
    /* renamed from: H */
    final void mo21H() {
        C0742y c0742y = this.f1380p;
        if (c0742y != null) {
            c0742y.m23h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p060v.AbstractC0737t
    /* renamed from: K */
    public final void mo20K(EnumC0736s enumC0736s) {
        super.mo20K(enumC0736s);
        if (enumC0736s == EnumC0736s.f1363a) {
            this.f1380p = null;
        }
    }

    @Override // com.github.catvod.spider.merge.p060v.AbstractC0732o
    /* renamed from: q */
    protected final void mo18q() {
        C0742y c0742y = this.f1380p;
        if (c0742y != null) {
            c0742y.m75c();
        }
    }
}
