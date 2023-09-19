package com.github.catvod.spider.merge.p060v;

/* renamed from: com.github.catvod.spider.merge.v.h */
/* loaded from: classes.dex */
final class C0725h extends AbstractC0718a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0725h() {
        super((C0717W) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p060v.AbstractC0718a
    /* renamed from: a */
    public final boolean mo69a(AbstractC0732o<?> abstractC0732o, C0722e c0722e, C0722e c0722e2) {
        C0722e c0722e3;
        synchronized (abstractC0732o) {
            c0722e3 = ((AbstractC0732o) abstractC0732o).f1356b;
            if (c0722e3 == c0722e) {
                ((AbstractC0732o) abstractC0732o).f1356b = c0722e2;
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p060v.AbstractC0718a
    /* renamed from: b */
    public final boolean mo68b(AbstractC0732o<?> abstractC0732o, Object obj, Object obj2) {
        Object obj3;
        synchronized (abstractC0732o) {
            obj3 = ((AbstractC0732o) abstractC0732o).f1355a;
            if (obj3 == obj) {
                ((AbstractC0732o) abstractC0732o).f1355a = obj2;
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p060v.AbstractC0718a
    /* renamed from: c */
    public final boolean mo67c(AbstractC0732o<?> abstractC0732o, C0731n c0731n, C0731n c0731n2) {
        C0731n c0731n3;
        synchronized (abstractC0732o) {
            c0731n3 = ((AbstractC0732o) abstractC0732o).f1357c;
            if (c0731n3 == c0731n) {
                ((AbstractC0732o) abstractC0732o).f1357c = c0731n2;
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p060v.AbstractC0718a
    /* renamed from: f */
    public final C0722e mo66f(AbstractC0732o abstractC0732o) {
        C0722e c0722e;
        C0722e c0722e2 = C0722e.f1333d;
        synchronized (abstractC0732o) {
            c0722e = abstractC0732o.f1356b;
            if (c0722e != c0722e2) {
                abstractC0732o.f1356b = c0722e2;
            }
        }
        return c0722e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p060v.AbstractC0718a
    /* renamed from: g */
    public final C0731n mo65g(AbstractC0732o abstractC0732o) {
        C0731n c0731n;
        C0731n c0731n2 = C0731n.f1348c;
        synchronized (abstractC0732o) {
            c0731n = abstractC0732o.f1357c;
            if (c0731n != c0731n2) {
                abstractC0732o.f1357c = c0731n2;
            }
        }
        return c0731n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p060v.AbstractC0718a
    /* renamed from: h */
    public final void mo64h(C0731n c0731n, C0731n c0731n2) {
        c0731n.f1350b = c0731n2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p060v.AbstractC0718a
    /* renamed from: i */
    public final void mo63i(C0731n c0731n, Thread thread) {
        c0731n.f1349a = thread;
    }
}
