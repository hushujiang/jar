package com.github.catvod.spider.merge.p057s;

/* renamed from: com.github.catvod.spider.merge.s.l */
/* loaded from: classes.dex */
final class C0685l<E> extends AbstractC0680g<E> {

    /* renamed from: c */
    final transient E f1299c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0685l(E e) {
        this.f1299c = e;
    }

    @Override // com.github.catvod.spider.merge.p057s.AbstractC0676c
    /* renamed from: a */
    final int mo99a(Object[] objArr) {
        objArr[0] = this.f1299c;
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f1299c.equals(obj);
    }

    @Override // com.github.catvod.spider.merge.p057s.AbstractC0676c, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: e */
    public final AbstractC0686m<E> iterator() {
        return new C0681h(this.f1299c);
    }

    @Override // com.github.catvod.spider.merge.p057s.AbstractC0680g, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f1299c.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String obj = this.f1299c.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }
}
