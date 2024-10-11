~class Hewan {
    constructor(nama) {
        this._nama = nama; 
    }

    suara() {
        throw new Error("Metode ini harus diimplementasikan oleh kelas anak.");
    }

    get nama() {
        return this._nama;
    }

    set nama(nama) {
        this._nama = nama;
    }
}

class Kendaraan {
    constructor(jenis) {
        this._jenis = jenis; 
    }

    get jenis() {
        return this._jenis;
    }

    set jenis(jenis) {
        this._jenis = jenis;
    }
}

class Kucing extends Hewan {
    suara() {
        return "Meow";
    }
}

Anak 2: Anjing
class Anjing extends Hewan {
    suara() {
        return "Bark";
    }
}

class Mobil extends Kendaraan {
    constructor(jenis, merk) {
        super(jenis);
        this._merk = merk; 
    }

    get merk() {
        return this._merk;
    }

    set merk(merk) {
        this._merk = merk;
    }

    get jenis() {
        return `Mobil jenis ${super.jenis} dan merk ${this._merk}`;
    }
}

const main = () => {
    const kucing = new Kucing("Kitty");
    const anjing = new Anjing("Buddy");
    const mobil = new Mobil("SUV", "Toyota");

    kucing.nama = "Mittens";
    console.log(`${kucing.nama} bersuara: ${kucing.suara()}`);
    console.log(`${anjing.nama} bersuara: ${anjing.suara()}`);

    console.log(mobil.jenis);
    console.log(mobil.merk);
};

main();
