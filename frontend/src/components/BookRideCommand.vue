<template>

    <v-card outlined>
        <v-card-title>
            BookRide
        </v-card-title>

        <v-card-text>
            <String label="PickupLocation" v-model="value.pickupLocation" :editMode="editMode"/>
            <String label="DropoffLocation" v-model="value.dropoffLocation" :editMode="editMode"/>
            <String label="PaymentType" v-model="value.paymentType" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="bookRide"
            >
                BookRide
            </v-btn>
            
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'BookRideCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.pickupLocation = '';
            this.value.dropoffLocation = '';
            this.value.paymentType = '';
        },
        watch: {
        },
        methods: {
            bookRide() {
                this.$emit('bookRide', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

