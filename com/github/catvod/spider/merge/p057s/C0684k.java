package com.github.catvod.spider.merge.p057s;

/* renamed from: com.github.catvod.spider.merge.s.k */
/* loaded from: classes.dex */
final class C0684k<E> extends AbstractC0680g<E> {

    /* renamed from: h */
    private static final Object[] f1292h;

    /* renamed from: i */
    static final C0684k<Object> f1293i;

    /* renamed from: c */
    final transient Object[] f1294c;

    /* renamed from: d */
    private final transient int f1295d;

    /* renamed from: e */
    final transient Object[] f1296e;

    /* renamed from: f */
    private final transient int f1297f;

    /* renamed from: g */
    private final transient int f1298g;

    static {
        Object[] objArr = new Object[0];
        f1292h = objArr;
        f1293i = new C0684k<>(objArr, 0, objArr, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0684k(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f1294c = objArr;
        this.f1295d = i;
        this.f1296e = objArr2;
        this.f1297f = i2;
        this.f1298g = i3;
    }

    @Override // com.github.catvod.spider.merge.p057s.AbstractC0676c
    /* renamed from: a */
    final int mo99a(Object[] objArr) {
        System.arraycopy(this.f1294c, 0, objArr, 0, this.f1298g);
        return this.f1298g + 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p057s.AbstractC0676c
    /* renamed from: b */
    public final Object[] mo103b() {
        return this.f1294c;
    }

    @Override // com.github.catvod.spider.merge.p057s.AbstractC0676c
    /* renamed from: c */
    final int mo102c() {
        return this.f1298g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object[] objArr = this.f1296e;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int m112a = C0675b.m112a(obj.hashCode());
        while (true) {
            int i = m112a & this.f1297f;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            m112a = i + 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p057s.AbstractC0676c
    /* renamed from: d */
    public final int mo101d() {
        return 0;
    }

    @Override // com.github.catvod.spider.merge.p057s.AbstractC0676c, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: e */
    public final AbstractC0686m<E> iterator() {
        return m108f().listIterator(0);
    }

    @Override // com.github.catvod.spider.merge.p057s.AbstractC0680g, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f1295d;
    }

    @Override // com.github.catvod.spider.merge.p057s.AbstractC0680g
    /* renamed from: i */
    final AbstractC0679f<E> mo100i() {
        Object[] objArr = this.f1294c;
        int i = this.f1298g;
        int i2 = AbstractC0679f.f1285c;
        if (i == 0) {
            return (AbstractC0679f<E>) C0683j.f1289f;
        }
        return new C0683j(objArr, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f1298g;
    }
}
