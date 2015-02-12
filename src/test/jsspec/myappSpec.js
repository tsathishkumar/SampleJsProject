describe("myapp", function() {

    var myapp;

    beforeEach(function () {
        myapp = new MyApp();
    });

    it("should be able to add 2 numbers", function () {
        var res = myapp.myNewFn(1, 2);
        expect(res).toBe(3);
    });
});

